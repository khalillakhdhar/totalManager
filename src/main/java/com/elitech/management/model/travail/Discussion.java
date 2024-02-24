package com.elitech.management.model.travail;

import java.util.List;
import java.util.Set;

import com.elitech.management.model.BaseEntity;
import com.elitech.management.model.users.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
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
public class Discussion extends BaseEntity {
	private String text;
	@ManyToOne(optional = false)
	@JsonIgnoreProperties("discussions")
	private User auteur;

}
