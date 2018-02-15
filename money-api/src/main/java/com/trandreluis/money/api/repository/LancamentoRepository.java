package com.trandreluis.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trandreluis.money.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

	
	
}