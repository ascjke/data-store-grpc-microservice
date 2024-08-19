package ru.borisov.datastoregrpcmicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.borisov.datastoregrpcmicroservice.model.Summary;
import ru.borisov.datastoregrpcmicroservice.web.dto.SummaryDto;

@Mapper(componentModel = "spring")
public interface SummaryMapper extends Mappable<Summary, SummaryDto> {
}
