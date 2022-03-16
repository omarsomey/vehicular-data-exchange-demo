package unipassau.thesis.vehiculardataexchangedemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import unipassau.thesis.vehiculardataexchangedemo.model.EncVehiculeData;
import unipassau.thesis.vehiculardataexchangedemo.repository.EncVehiculeDataRepository;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class EncVehiculeDataService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<EncVehiculeData> fetch() {

        String sql = "SELECT * FROM enc_vehicule_data";

        List<EncVehiculeData> encVehiculeData = new ArrayList<>();

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        for (Map row : rows) {
            EncVehiculeData obj = new EncVehiculeData();

            obj.setId(((Long) row.get("ID")).longValue());
            obj.setEncrpytedData((String)row.get("ENCRYPTEDDATA"));
            obj.setTimestamp((String) row.get("TIMESTAMP"));
            encVehiculeData.add(obj);
        }
        return encVehiculeData;
    }





}
