package com.trandreluis.money.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.trandreluis.money.api.model.Lancamento;
import com.trandreluis.money.api.model.Pessoa;
import com.trandreluis.money.api.repository.LancamentoRepository;
import com.trandreluis.money.api.repository.PessoaRepository;
import com.trandreluis.money.api.repository.filter.LancamentoFilter;
import com.trandreluis.money.api.repository.projection.ResumoLancamento;
import com.trandreluis.money.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento save(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getId());
		if (pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}

		return lancamentoRepository.save(lancamento);
	}

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable) {
		return lancamentoRepository.filtrar(lancamentoFilter, pageable);
	}

	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable) {
		return lancamentoRepository.resumir(lancamentoFilter, pageable);
	}

	public void remover(Long id) {
		lancamentoRepository.delete(id);
	}

	public Lancamento buscarPeloId(Long id) {
		return lancamentoRepository.findOne(id);
	}

}