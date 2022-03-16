package unipassau.thesis.vehiculardataexchangedemo.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;
import unipassau.thesis.vehiculardataexchangedemo.model.VehicleData;

public class VehicleDataProcessor implements ItemProcessor<VehicleOutput, VehicleData> {

    private static final Logger log = LoggerFactory.getLogger(VehicleDataProcessor.class);

    @Override
    public VehicleData process(final VehicleOutput vehicleOutput) throws Exception {

        VehicleData vehicledata = new VehicleData();
        vehicledata.setId(Long.parseLong(vehicleOutput.getId()));
        vehicledata.setAltitude(vehicleOutput.getAltitude());
        vehicledata.setBearing(vehicleOutput.getBearing());
        vehicledata.setDevice_time(vehicleOutput.getDevice_time());
        vehicledata.setEngine_load(vehicleOutput.getEngine_load());
        vehicledata.setEngine_temp(vehicleOutput.getEngine_temp());
        vehicledata.setGps_speed(vehicleOutput.getGps_speed());
        vehicledata.setHdop(vehicleOutput.getHdop());
        vehicledata.setRpm(vehicleOutput.getRpm());
        vehicledata.setThrottle_p(vehicleOutput.getThrottle_p());
        vehicledata.setLatitude(vehicleOutput.getLatitude());
        vehicledata.setLongitude(vehicleOutput.getLongitude());
        vehicledata.setGps_time(vehicleOutput.getGps_time());




        return vehicledata;
    }

}