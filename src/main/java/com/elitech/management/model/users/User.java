package com.elitech.management.model.users;

import com.elitech.management.model.BaseEntity;
import com.elitech.management.model.personel.Adresse;
import com.elitech.management.model.personel.Conge;
import com.elitech.management.model.personel.Salaire;
import com.elitech.management.model.travail.Discussion;
import com.elitech.management.model.travail.Equipe;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
public class User extends BaseEntity{
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String prenom;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private int age;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user",fetch = FetchType.LAZY)
	@JsonIgnoreProperties("user")
	private Adresse adresse;
	
	@Enumerated(EnumType.STRING)
	private Grade grade;
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnoreProperties("user")
	private List<Salaire> salaires;
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnoreProperties("user")
	private List<Conge> conges;
	@ManyToMany(mappedBy = "users")
	@JsonIgnoreProperties("users")

	private Set<Equipe> equipes;
	@OneToMany(mappedBy = "auteur",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnoreProperties("auteur")
	private List<Discussion> discussions;
	

}
