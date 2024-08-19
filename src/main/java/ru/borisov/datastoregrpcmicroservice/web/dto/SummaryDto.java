package ru.borisov.datastoregrpcmicroservice.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ru.borisov.datastoregrpcmicroservice.model.Data;
import ru.borisov.datastoregrpcmicroservice.model.Summary;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class SummaryDto {

    private Long sensorId;
    private Map<Data.MeasurementType, List<Summary.SummaryEntry>> values;

}
