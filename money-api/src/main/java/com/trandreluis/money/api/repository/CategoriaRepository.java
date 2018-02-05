package com.trandreluis.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trandreluis.money.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
	
}