package unipassau.thesis.vehiculardataexchangedemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unipassau.thesis.vehiculardataexchangedemo.model.VehiculeData;
import unipassau.thesis.vehiculardataexchangedemo.services.VehiculeDataService;

import java.util.List;

@RestController
public class VehiculeDataController {

    @Autowired
    private VehiculeDataService vehiculeDataService;

    @GetMapping("/vehiculedata")
    public List<VehiculeData> getVehiculeData(){
        return  vehiculeDataService.list();
    }

}
