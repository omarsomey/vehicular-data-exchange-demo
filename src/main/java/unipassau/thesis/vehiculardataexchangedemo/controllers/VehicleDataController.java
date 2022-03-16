package unipassau.thesis.vehiculardataexchangedemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import unipassau.thesis.vehiculardataexchangedemo.model.EncVehicleData;
import unipassau.thesis.vehiculardataexchangedemo.model.VehicleData;
import unipassau.thesis.vehiculardataexchangedemo.services.EncVehicleDataService;
import unipassau.thesis.vehiculardataexchangedemo.services.VehicleDataService;

import java.time.Duration;
import java.util.List;

@RestController
public class VehicleDataController {

    @Autowired
    private VehicleDataService vehicleDataService;
    @Autowired
    private EncVehicleDataService encVehicleDataService;

    @GetMapping("/data/vehicleData")
    public List<VehicleData> getvehicleData(){
        return  vehicleDataService.list();
    }


    @GetMapping("/data/encVehicleData")
    public List<EncVehicleData> getEncvehicleData(){
        return encVehicleDataService.list();
    }

    @GetMapping(value = "/data/streamVehicleData", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Object> findAll() {
        List<VehicleData> data = vehicleDataService.list();
        return Flux.interval(Duration.ofSeconds(1)).map(i -> data.get(i.intValue()));
    }


}
