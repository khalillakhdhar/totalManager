package com.elitech.management.model.dto;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {
private long id;
@Size(min= 3,max = 50,message="nom doit avoir au moins 3 caractéres et max 50")
@NotBlank(message = "le nom n'est pas vide")
private String nom;
@Email(message = "email doit être valide")
private String email;
@Size(min = 6,message = "le mot de passe doit contenir au moins 6caractéres")
private String password;
@Min(value = 18,message = "les employées doivent être majeur")
private int age;
private AdresseDTO adresseDTO;
private List<SalaireDTO> salaireDTOs;
private List<CongeDTO> congeDTOs;
private List<EquipeDTO> equipeDTOs;
private List<DiscussionDTO> discussionDTOs;
}
