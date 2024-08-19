package ru.borisov.datastoregrpcmicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.borisov.datastoregrpcmicroservice.model.Data;
import ru.borisov.datastoregrpcmicroservice.model.Summary;
import ru.borisov.datastoregrpcmicroservice.service.SummaryService;
import ru.borisov.datastoregrpcmicroservice.web.dto.SummaryDto;
import ru.borisov.datastoregrpcmicroservice.web.mapper.SummaryMapper;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/analytics")
@RequiredArgsConstructor
public class AnalyticsController {

    private final SummaryService summaryService;
    private final SummaryMapper summaryMapper;

    @GetMapping("/summary/{sensorId}")
    public SummaryDto getSummary(@PathVariable long sensorId,
                                 @RequestParam(value = "mt", required = false) Set<Data.MeasurementType> measurementTypes,
                                 @RequestParam(value = "st", required = false) Set<Summary.SummaryType> summaryTypes) {

        Summary summary = summaryService.get(
                sensorId,
                measurementTypes,
                summaryTypes
        );
        return summaryMapper.toDto(summary);
    }

}
