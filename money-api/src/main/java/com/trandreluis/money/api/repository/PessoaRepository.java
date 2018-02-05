package com.trandreluis.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trandreluis.money.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	
	
}