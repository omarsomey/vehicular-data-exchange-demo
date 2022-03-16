package unipassau.thesis.vehiculardataexchangedemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unipassau.thesis.vehiculardataexchangedemo.model.EncVehiculeData;
import unipassau.thesis.vehiculardataexchangedemo.services.EncVehiculeDataService;

import java.util.List;

@RestController
public class EncVehiculeDataController {
    @Autowired
    private EncVehiculeDataService encVehiculeDataService;

    @GetMapping("/encVehiculeData")
    public List<EncVehiculeData> getEncVehiculeData(){
        return encVehiculeDataService.fetch();
    }

}
