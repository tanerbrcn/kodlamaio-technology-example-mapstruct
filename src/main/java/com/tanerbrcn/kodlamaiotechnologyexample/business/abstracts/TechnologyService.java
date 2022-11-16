package com.tanerbrcn.kodlamaiotechnologyexample.business.abstracts;

import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.dto.TechnologyDto;

import java.util.List;

public interface TechnologyService {

	List<TechnologyDto> getAllTechnologies();

	TechnologyDto getTechnologyById(Integer id);

	void add(TechnologyDto technologyDto);

	void update(Integer id, TechnologyDto technologyDto);

	void delete(Integer id);

}
