package com.elitech.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.management.model.travail.Equipe;

public interface DiscussionRepository extends JpaRepository<Equipe, Long> {

}
