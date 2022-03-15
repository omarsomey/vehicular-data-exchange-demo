package unipassau.thesis.vehiculardataexchangedemo.VehiculeDataController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unipassau.thesis.vehiculardataexchangedemo.model.VehiculeData;
import unipassau.thesis.vehiculardataexchangedemo.services.VehiculeService;

import java.util.List;

@RestController
public class VehiculeDataController {

    @Autowired
    private VehiculeService vehiculeService;

    @GetMapping("/vehiculedata")
    public List<VehiculeData> getVehiculeData(){
        return  vehiculeService.list();
    }

}
