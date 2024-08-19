package ru.borisov.datastoregrpcmicroservice.service;

import ru.borisov.datastoregrpcmicroservice.model.Data;
import ru.borisov.datastoregrpcmicroservice.model.Summary;

import java.util.Set;

public interface SummaryService {

    Summary get(long sensorId, Set<Data.MeasurementType> measurementTypes, Set<Summary.SummaryType> summaryTypes);

    void handle(Data data);

}
