package com.elitech.management.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AdresseDTO {
	private long id;
	@Size(min = 4,max = 4)
	
	private int zipcode;
	@NotBlank
	private String pays;
	@NotBlank
	private String ville;
	
	private UserDTO userDTO;
}
