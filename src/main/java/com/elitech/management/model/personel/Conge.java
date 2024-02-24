package com.elitech.management.model.personel;

import java.io.Serializable;

import com.elitech.management.model.BaseEntity;
import com.elitech.management.model.users.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Conge extends BaseEntity   implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(nullable = false)
private String debut;
	@Column(nullable = false)
private int duree;
	@Column(nullable = false,columnDefinition = "varchar(30) default 'en attente' ")
private String etat;
	
private String explication;
@Enumerated(EnumType.STRING)
private TypeConge typeConge;
@ManyToOne(fetch = FetchType.EAGER,optional =false)
@JsonIgnoreProperties("conges")
private User user;

}
