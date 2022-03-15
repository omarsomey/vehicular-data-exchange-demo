package unipassau.thesis.vehiculardataexchangedemo.model;

import javax.persistence.*;

@Entity
@Table(name = "enc_vehicule_data")
public class EncVehiculeData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String timestamp;
    private String encrpytedData;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getEncrpytedData() {
        return encrpytedData;
    }

    public void setEncrpytedData(String encrpytedData) {
        this.encrpytedData = encrpytedData;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
