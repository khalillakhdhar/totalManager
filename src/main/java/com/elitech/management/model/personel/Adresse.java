package com.elitech.management.model.personel;


import com.elitech.management.model.users.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
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
public class Adresse  {
	/**
	 * 
	 */
	@Id
	private long id;
	private int zipcode;
	private String pays;
	private String ville;
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	//@JoinColumn(name = "id")
	@JsonIgnoreProperties("adresse")
	private User user;

}
