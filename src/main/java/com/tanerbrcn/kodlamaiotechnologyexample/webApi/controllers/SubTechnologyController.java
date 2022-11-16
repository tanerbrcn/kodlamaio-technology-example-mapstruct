package com.tanerbrcn.kodlamaiotechnologyexample.webApi.controllers;

import com.tanerbrcn.kodlamaiotechnologyexample.business.abstracts.SubTechnologyService;
import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.dto.SubTechnologyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sub-technologies")
public class SubTechnologyController {

	private final SubTechnologyService subTechnologyService;

	@GetMapping("/getall")
	public List<SubTechnologyDto> getAllSubTechnologyDtos() {
		return subTechnologyService.getAllSubTechnologies();
	}

	@GetMapping("/get/{id}")
	public SubTechnologyDto getSubTechnology(@PathVariable int id) {
		return subTechnologyService.getSubTechnologyById(id);
	}

	@PostMapping("/add")
	public void addSubTechnology(@RequestBody SubTechnologyDto subTechnologyDto) {
		subTechnologyService.add(subTechnologyDto);
	}

	@PutMapping("/update/{id}")
	public void updateSubTechnology(@RequestBody SubTechnologyDto subTechnologyDto, @PathVariable int id) {
		subTechnologyService.update(id, subTechnologyDto);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteSubTechnology(@PathVariable int id) {
		subTechnologyService.delete(id);
	}
}
