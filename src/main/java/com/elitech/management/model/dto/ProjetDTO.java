package com.elitech.management.model.dto;

import jakarta.validation.constraints.NotBlank;

public record ProjetDTO(
		@NotBlank
		String titre,
		@NotBlank
		String description,
		@NotBlank
		EquipeDTO equipeDTO
		) {

}
