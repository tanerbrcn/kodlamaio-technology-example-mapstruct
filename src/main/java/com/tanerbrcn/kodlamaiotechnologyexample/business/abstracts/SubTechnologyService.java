package com.tanerbrcn.kodlamaiotechnologyexample.business.abstracts;


import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.dto.SubTechnologyDto;

import java.util.List;

public interface SubTechnologyService {
	List<SubTechnologyDto> getAllSubTechnologies();
	SubTechnologyDto getSubTechnologyById(int id);
	void add(SubTechnologyDto subTechnologyDto);
	void update(int id,SubTechnologyDto subTechnologyDto);
	void delete(int id);
}
