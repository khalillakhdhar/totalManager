package com.elitech.management.model.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;


public record EquipeDTO(
		@NotBlank
		String titre,
		@NotBlank
		String description,
		List<UserDTO> users,
		List<ProjetDTO> projetDTOs
		
		
		) {

}
