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

        vehiculedata.setAltitude(vehiculeOutput.getAltitude());


        return vehiculedata;
    }

}