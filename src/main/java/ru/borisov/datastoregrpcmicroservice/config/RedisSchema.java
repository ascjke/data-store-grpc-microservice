package ru.borisov.datastoregrpcmicroservice.config;

import ru.borisov.datastoregrpcmicroservice.model.Data;

public class RedisSchema {

    // set
    public static String sensorKeys() {

        return KeyHelper.getKey("sensors");
    }

    // hash with summary types
    // sensors:1:voltage
    public static String summaryKey(
            long sensorId,
            Data.MeasurementType measurementType
    ) {

        return KeyHelper.getKey("sensors:" + sensorId + ":" + measurementType.name().toLowerCase());
    }

}
