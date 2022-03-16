package unipassau.thesis.vehiculardataexchangedemo.data;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import unipassau.thesis.vehiculardataexchangedemo.model.VehicleData;


@Configuration
@EnableBatchProcessing
public class BatchConfig {

    private final String[] FIELD_NAMES= new String[]{
            "id", "gps_time", "device_time", "longitude", "latitude", "gps_speed", "hdop", "altitude", "bearing", "engine_temp", "rpm", "engine_load", "throttle_p"
    };

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public FlatFileItemReader<VehicleOutput> reader() {
        return new FlatFileItemReaderBuilder<VehicleOutput>()
                .name("VehicleOutputItemReader")
                .resource(new ClassPathResource("OBD.csv"))
                .delimited()
                .names(FIELD_NAMES)
                .fieldSetMapper(new BeanWrapperFieldSetMapper<VehicleOutput>() {{
                    setTargetType(VehicleOutput.class);
                }})
                .build();
    }

    @Bean
    public VehicleDataProcessor processor() {
        return new VehicleDataProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<VehicleData> writer(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<VehicleData>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("INSERT INTO vehicledata (id, gps_time, device_time, longitude, latitude, gps_speed, hdop, altitude, bearing, engine_temp, rpm, engine_load, throttle_p) "
                        + " VALUES (:id, :gps_time, :device_time, :longitude, :latitude, :gps_speed, :hdop, :altitude, :bearing, :engine_temp, :rpm, :engine_load, :throttle_p)")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter<VehicleData> writer) {
        return stepBuilderFactory.get("step1")
                .<VehicleOutput, VehicleData> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer)
                .build();
    }
}