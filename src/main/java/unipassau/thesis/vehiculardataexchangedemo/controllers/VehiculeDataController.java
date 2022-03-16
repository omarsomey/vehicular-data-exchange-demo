package unipassau.thesis.vehiculardataexchangedemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unipassau.thesis.vehiculardataexchangedemo.model.EncVehiculeData;
import unipassau.thesis.vehiculardataexchangedemo.model.VehiculeData;
import unipassau.thesis.vehiculardataexchangedemo.services.EncVehiculeDataService;
import unipassau.thesis.vehiculardataexchangedemo.services.VehiculeDataService;

import java.util.List;

@RestController
public class VehiculeDataController {

    @Autowired
    private VehiculeDataService vehiculeDataService;
    @Autowired
    private EncVehiculeDataService encVehiculeDataService;

    @GetMapping("/data/vehiculeData")
    public List<VehiculeData> getVehiculeData(){
        return  vehiculeDataService.list();
    }


    @GetMapping("/data/encVehiculeData")
    public List<EncVehiculeData> getEncVehiculeData(){
        return encVehiculeDataService.list();
    }

}
