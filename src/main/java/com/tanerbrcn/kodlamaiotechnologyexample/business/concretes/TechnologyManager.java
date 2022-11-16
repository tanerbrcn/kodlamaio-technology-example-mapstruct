package com.tanerbrcn.kodlamaiotechnologyexample.business.concretes;

import com.tanerbrcn.kodlamaiotechnologyexample.business.abstracts.TechnologyService;
import com.tanerbrcn.kodlamaiotechnologyexample.dataAccess.abstracts.TechnologyRepository;
import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.dto.TechnologyDto;
import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.entities.Technology;
import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.mapper.TechnologyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TechnologyManager implements TechnologyService {

	private final TechnologyRepository technologyRepository;
	private final TechnologyMapper technologyMapper;

	@Override
	public List<TechnologyDto> getAllTechnologies() {
		List<Technology> technologies = technologyRepository.findAll();
		return technologyMapper.toTechnologyDtos(technologies);
	}

	@Override
	public TechnologyDto getTechnologyById(Integer id) {
		Optional<Technology> technology = technologyRepository.findById(id);
		return technologyMapper.toTechnologyDto(technologyRepository.getReferenceById(id));
	}

	@Override
	public void add(TechnologyDto technologyDto) {
		Technology technology = technologyMapper.toTechnology(technologyDto);
		technologyRepository.save(technology);
	}

	@Override
	public void update(Integer id, TechnologyDto technologyDto) {
		Technology technology = technologyRepository.findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
		technology.setName(technologyDto.getName());
		technologyRepository.save(technology);
	}

	@Override
	public void delete(Integer id) {
		technologyRepository.deleteById(id);
	}
}
