package com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.mapper;

import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.dto.TechnologyDto;
import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.entities.Technology;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TechnologyMapper {
	TechnologyDto toTechnologyDto(Technology technology);
	Technology toTechnology(TechnologyDto technologyDto);
	List<TechnologyDto> toTechnologyDtos(List<Technology> technologies);
}
