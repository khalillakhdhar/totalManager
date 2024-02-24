package com.elitech.management.model.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class SalaireDTO {
	
	@Min(value = 1)
	@Max(value = 12)
	private int mois;
	@Min(value=2023)
	int annees;
	@NotBlank
	private String etat;
	@Positive
	private double valeur;
	
	private UserDTO userDTO;
}
