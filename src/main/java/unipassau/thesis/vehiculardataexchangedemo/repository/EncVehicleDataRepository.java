package unipassau.thesis.vehiculardataexchangedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unipassau.thesis.vehiculardataexchangedemo.model.EncVehicleData;

@Repository
public interface EncVehicleDataRepository extends JpaRepository<EncVehicleData, Long> {}
