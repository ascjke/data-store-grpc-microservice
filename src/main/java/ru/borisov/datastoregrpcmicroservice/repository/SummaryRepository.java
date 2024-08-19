package ru.borisov.datastoregrpcmicroservice.repository;

import ru.borisov.datastoregrpcmicroservice.model.Data;
import ru.borisov.datastoregrpcmicroservice.model.Summary;

import java.util.Optional;
import java.util.Set;

public interface SummaryRepository {

    Optional<Summary> findBySensorId(long sensorId, Set<Data.MeasurementType> measurementTypes, Set<Summary.SummaryType> summaryTypes);

    void handle(Data data);

}
