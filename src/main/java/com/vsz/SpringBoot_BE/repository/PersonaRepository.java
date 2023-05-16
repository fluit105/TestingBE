package com.vsz.SpringBoot_BE.repository;

import com.vsz.SpringBoot_BE.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** @author Santiago Valdez */

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
	
}