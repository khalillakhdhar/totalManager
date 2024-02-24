package com.elitech.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.management.model.personel.Salaire;

public interface SalaireRepository
		extends JpaRepository<Salaire, java.lang.Long> {

}
