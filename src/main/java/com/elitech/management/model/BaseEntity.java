package com.elitech.management.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@MappedSuperclass

public abstract class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(nullable = false,updatable = false)
private LocalDateTime createdAt;
	@Column(nullable = false)
private LocalDateTime updatedAt;
	@PrePersist
	public void prePersist()
	{
		createdAt=updatedAt=LocalDateTime.now();
		
	}
	@PreUpdate
	public void preUpdate()
	{
		updatedAt=LocalDateTime.now();
		
	}
}
