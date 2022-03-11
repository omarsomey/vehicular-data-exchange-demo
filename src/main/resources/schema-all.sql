DROP TABLE vehiculedata IF EXISTS;

CREATE TABLE vehiculedata  (
                         id BIGINT IDENTITY NOT NULL PRIMARY KEY,
                         gps_time VARCHAR(60),
                         device_time VARCHAR(20),
                         longitude VARCHAR(20),
                         latitude VARCHAR(20),
                         gps_speed VARCHAR(20),
                         hdop VARCHAR(20),
                         altitude VARCHAR(20),
                         bearing VARCHAR(20),
                         engine_temp VARCHAR(20),
                         rpm VARCHAR(20),
                         engine_load VARCHAR(20),
                         throttle_p VARCHAR(20)
);