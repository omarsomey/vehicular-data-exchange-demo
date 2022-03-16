package unipassau.thesis.vehiculardataexchangedemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unipassau.thesis.vehiculardataexchangedemo.model.VehiculeData;
import unipassau.thesis.vehiculardataexchangedemo.repository.VehiculeDataRepository;

import java.util.List;

@Service
public class VehiculeDataService {

    @Autowired
    private VehiculeDataRepository vehiculeDataRepository;


    public List<VehiculeData> list(){return vehiculeDataRepository.findAll();    }


}
