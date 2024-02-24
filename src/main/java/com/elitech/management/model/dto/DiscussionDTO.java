package com.elitech.management.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DiscussionDTO(
		@NotBlank
		String text,
		@NotBlank
		UserDTO auteur
		) {

}
