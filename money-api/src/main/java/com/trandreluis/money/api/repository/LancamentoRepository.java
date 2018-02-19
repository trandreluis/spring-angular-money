package com.trandreluis.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trandreluis.money.api.model.Lancamento;
import com.trandreluis.money.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

	
	
}