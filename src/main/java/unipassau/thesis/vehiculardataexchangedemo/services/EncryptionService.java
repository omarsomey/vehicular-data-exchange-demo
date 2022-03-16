package unipassau.thesis.vehiculardataexchangedemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unipassau.thesis.vehiculardataexchangedemo.model.EncVehiculeData;
import unipassau.thesis.vehiculardataexchangedemo.model.VehiculeData;
import unipassau.thesis.vehiculardataexchangedemo.repository.EncVehiculeDataRepository;
import unipassau.thesis.vehiculardataexchangedemo.repository.VehiculeDataRepository;

import java.util.List;

@Service
public class EncryptionService {
    @Autowired
    private EncVehiculeDataRepository encVehiculeDataRepository;

    @Autowired
    private VehiculeDataService vehiculeDataService;

    List<VehiculeData> data = vehiculeDataService.list();





}
