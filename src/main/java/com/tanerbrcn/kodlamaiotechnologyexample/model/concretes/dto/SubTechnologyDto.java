package com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubTechnologyDto {
	@NotBlank
	private String name;

}
