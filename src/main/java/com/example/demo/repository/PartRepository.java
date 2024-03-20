package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Part;

public interface PartRepository extends JpaRepository<Part, Long> {
	
	void deletePartById(Long id);
	Optional<Part> findPartById(Long id);

}
