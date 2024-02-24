package com.elitech.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.management.model.travail.Equipe;

public interface ProjetRepository extends JpaRepository<Equipe, Long> {

}
