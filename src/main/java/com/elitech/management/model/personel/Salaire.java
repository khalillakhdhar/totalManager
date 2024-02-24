package com.elitech.management.model.personel;

import com.elitech.management.model.BaseEntity;
import com.elitech.management.model.users.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
public class Salaire extends BaseEntity {
	@Column(nullable = false)
	private int mois,annees;
	@Column(nullable = false,columnDefinition = "varchar(30) default 'en attente' ")
	private String etat;
	@Column(nullable = false)
	private double valeur;
	@ManyToOne(fetch = FetchType.EAGER,optional =false)
	@JsonIgnoreProperties("salaires")
	private User user;

}
