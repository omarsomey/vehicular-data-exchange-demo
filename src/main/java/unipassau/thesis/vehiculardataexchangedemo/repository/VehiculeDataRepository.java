package unipassau.thesis.vehiculardataexchangedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unipassau.thesis.vehiculardataexchangedemo.model.VehiculeData;

import java.util.List;
@Repository
public interface VehiculeDataRepository extends JpaRepository<VehiculeData, Long> {}
