package com.elitech.management.model.travail;

import java.util.Set;

import com.elitech.management.model.BaseEntity;
import com.elitech.management.model.personel.Conge;
import com.elitech.management.model.personel.TypeConge;
import com.elitech.management.model.users.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;
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
public class Equipe extends BaseEntity {
	@Column(nullable = false,unique = true)
	private String titre;
	@Column(nullable = false)
	private String  description;
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JsonIgnoreProperties("equipes")

	private Set<User> users;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "equipes")
	@JsonIgnoreProperties("equipes")
	private List<Projet> projets;

}
