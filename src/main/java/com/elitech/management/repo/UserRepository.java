package com.elitech.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.management.model.users.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
