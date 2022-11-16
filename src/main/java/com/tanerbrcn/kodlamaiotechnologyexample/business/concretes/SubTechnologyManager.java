package com.tanerbrcn.kodlamaiotechnologyexample.business.concretes;

import com.tanerbrcn.kodlamaiotechnologyexample.business.abstracts.SubTechnologyService;
import com.tanerbrcn.kodlamaiotechnologyexample.dataAccess.abstracts.SubTechnologyRepository;
import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.dto.SubTechnologyDto;
import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.entities.SubTechnology;
import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.mapper.SubTechnologyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SubTechnologyManager implements SubTechnologyService {

	private final SubTechnologyRepository subTechnologyRepository;
	private final SubTechnologyMapper subTechnologyMapper;

	@Override
	public List<SubTechnologyDto> getAllSubTechnologies() {
		List<SubTechnology> technologies = subTechnologyRepository.findAll();
		return subTechnologyMapper.subTechnologyDtos(technologies);
	}

	@Override
	public SubTechnologyDto getSubTechnologyById(int id) {
		Optional<SubTechnology> subTechnology = subTechnologyRepository.findById(id);
		return subTechnologyMapper.toSubTechnologyDto(subTechnologyRepository.getReferenceById(id));
	}

	@Override
	public void add(SubTechnologyDto subTechnologyDto) {
		SubTechnology subTechnology = subTechnologyMapper.toSubTechnology(subTechnologyDto);
		subTechnologyRepository.save(subTechnology);
	}

	@Override
	public void update(int id, SubTechnologyDto subTechnologyDto) {
		SubTechnology subTechnology = subTechnologyRepository.findById(id).orElseThrow(() -> new RuntimeException("ID not found"));
		subTechnology.setName(subTechnologyDto.getName());
		subTechnologyRepository.save(subTechnology);
	}

	@Override
	public void delete(int id) {
		subTechnologyRepository.deleteById(id);
	}
}
