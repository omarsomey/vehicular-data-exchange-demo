package unipassau.thesis.vehiculardataexchangedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unipassau.thesis.vehiculardataexchangedemo.model.VehicleData;

@Repository
public interface VehicleDataRepository extends JpaRepository<VehicleData, Long> {}
