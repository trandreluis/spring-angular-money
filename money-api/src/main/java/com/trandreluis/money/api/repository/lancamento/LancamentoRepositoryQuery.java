package com.trandreluis.money.api.repository.lancamento;

import com.trandreluis.money.api.repository.filter.LancamentoFilter;
import com.trandreluis.money.api.model.Lancamento;

import java.util.List;


public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
	
}