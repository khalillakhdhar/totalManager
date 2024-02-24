package com.elitech.management.model.dto;

import com.elitech.management.model.personel.TypeConge;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CongeDTO(
		 String debut,
	@Positive	
	 int duree,
		@NotBlank
	 String etat,
	@NotBlank
	 String explication,
	@NotBlank
	 TypeConge typeConge,
	
	 UserDTO user
		
		) {

}
