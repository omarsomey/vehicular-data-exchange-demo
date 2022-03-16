package unipassau.thesis.vehiculardataexchangedemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unipassau.thesis.vehiculardataexchangedemo.model.EncVehicleData;
import unipassau.thesis.vehiculardataexchangedemo.repository.EncVehicleDataRepository;

import java.util.List;


@Service
public class EncVehicleDataService {

    @Autowired
    private EncVehicleDataRepository encvehicleDataRepository;

    public List<EncVehicleData> list(){return encvehicleDataRepository.findAll();    }


/*
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<EncvehicleData> fetch() {

        String sql = "SELECT * FROM enc_vehicle_data";

        List<EncvehicleData> encvehicleData = new ArrayList<>();

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        for (Map row : rows) {
            EncvehicleData obj = new EncvehicleData();

            obj.setId(((Long) row.get("ID")).longValue());
            obj.setTimestamp((String) row.get("TIMESTAMP"));
            obj.setEncrpytedData((String)row.get("ENCRYPTEDDATA"));
            encvehicleData.add(obj);
        }
        return encvehicleData;
    }
*/





}
