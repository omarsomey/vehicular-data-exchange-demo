package unipassau.thesis.vehiculardataexchangedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unipassau.thesis.vehiculardataexchangedemo.model.EncVehiculeData;

@Repository
public interface EncVehiculeDataRepository extends JpaRepository<EncVehiculeData, Long> {}
