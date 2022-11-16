package com.tanerbrcn.kodlamaiotechnologyexample.webApi.controllers;

import com.tanerbrcn.kodlamaiotechnologyexample.business.abstracts.TechnologyService;
import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.dto.TechnologyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/technologies")
public class TechnologyController {
	private final TechnologyService technologyService;

	@GetMapping("/getall")
	public List<TechnologyDto> getAllTechnologies() {
		return technologyService.getAllTechnologies();
	}

	@GetMapping("/get/{id}")
	public TechnologyDto getTechnology(@PathVariable int id) {
		return technologyService.getTechnologyById(id);
	}

	@PostMapping("/add")
	public void addTechnology(@RequestBody TechnologyDto technologyDto) {
		technologyService.add(technologyDto);
	}

	@PutMapping("/update/{id}")
	public void updateTechnology(@PathVariable int id, @RequestBody TechnologyDto technologyDto) {
		technologyService.update(id, technologyDto);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteTechnology(@PathVariable int id) {
		technologyService.delete(id);
	}
}
