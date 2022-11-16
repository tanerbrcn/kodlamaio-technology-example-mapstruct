package com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.mapper;

import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.dto.SubTechnologyDto;
import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.entities.SubTechnology;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SubTechnologyMapper {
	SubTechnology toSubTechnology(SubTechnologyDto subTechnologyDto);
	SubTechnologyDto toSubTechnologyDto(SubTechnology subTechnology);
	List<SubTechnologyDto> subTechnologyDtos(List<SubTechnology>technologies);
}
