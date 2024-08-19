package ru.borisov.datastoregrpcmicroservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.borisov.datastoregrpcmicroservice.model.Data;
import ru.borisov.datastoregrpcmicroservice.model.Summary;
import ru.borisov.datastoregrpcmicroservice.model.exceptiion.SensorNotFoundException;
import ru.borisov.datastoregrpcmicroservice.repository.SummaryRepository;

import java.util.Set;

@Service
@RequiredArgsConstructor
@Slf4j
public class SummaryServiceImpl implements SummaryService {

    private final SummaryRepository summaryRepository;

    @Override
    public Summary get(long sensorId, Set<Data.MeasurementType> measurementTypes, Set<Summary.SummaryType> summaryTypes) {

        return summaryRepository.findBySensorId(
                        sensorId,
                        measurementTypes == null ? Set.of(Data.MeasurementType.values()) : measurementTypes,
                        summaryTypes == null ? Set.of(Summary.SummaryType.values()) : summaryTypes
                )
                .orElseThrow(SensorNotFoundException::new);
    }

    @Override
    public void handle(Data data) {

        summaryRepository.handle(data);
    }

}
