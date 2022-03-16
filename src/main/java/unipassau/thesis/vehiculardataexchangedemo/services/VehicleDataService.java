package unipassau.thesis.vehiculardataexchangedemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unipassau.thesis.vehiculardataexchangedemo.model.VehicleData;
import unipassau.thesis.vehiculardataexchangedemo.repository.VehicleDataRepository;

import java.util.List;

@Service
public class VehicleDataService {

    @Autowired
    private VehicleDataRepository vehicleDataRepository;


    public List<VehicleData> list(){return vehicleDataRepository.findAll();    }


}
