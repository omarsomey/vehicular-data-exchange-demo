package unipassau.thesis.vehiculardataexchangedemo.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;
import unipassau.thesis.vehiculardataexchangedemo.model.VehiculeData;

public class VehiculeDataProcessor implements ItemProcessor<VehiculeOutput, VehiculeData> {

    private static final Logger log = LoggerFactory.getLogger(VehiculeDataProcessor.class);

    @Override
    public VehiculeData process(final VehiculeOutput vehiculeOutput) throws Exception {

        VehiculeData vehiculedata = new VehiculeData();
        vehiculedata.setId(Long.parseLong(vehiculeOutput.getId()));
        vehiculedata.setAltitude(vehiculeOutput.getAltitude());
        vehiculedata.setBearing(vehiculeOutput.getBearing());
        vehiculedata.setDevice_time(vehiculeOutput.getDevice_time());
        vehiculedata.setEngine_load(vehiculeOutput.getEngine_load());
        vehiculedata.setEngine_temp(vehiculeOutput.getEngine_temp());
        vehiculedata.setGps_speed(vehiculeOutput.getGps_speed());
        vehiculedata.setHdop(vehiculeOutput.getHdop());
        vehiculedata.setRpm(vehiculeOutput.getRpm());
        vehiculedata.setThrottle_p(vehiculeOutput.getThrottle_p());
        vehiculedata.setLatitude(vehiculeOutput.getLatitude());
        vehiculedata.setLongitude(vehiculeOutput.getLongitude());
        vehiculedata.setGps_time(vehiculeOutput.getGps_time());




        return vehiculedata;
    }

}