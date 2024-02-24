package com.elitech.management.model.travail;

import java.util.Set;

import com.elitech.management.model.BaseEntity;
import com.elitech.management.model.users.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
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
public class Projet extends BaseEntity {
	@Column(nullable = false,unique = true)
	private String titre;
	@Lob
	@Column(columnDefinition = "varchar(500)",nullable = false)
	private String description;
	
	private String url;
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	private Equipe equipes;

}
