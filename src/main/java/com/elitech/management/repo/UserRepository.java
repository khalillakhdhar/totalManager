package com.elitech.management.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.management.model.users.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);

}
