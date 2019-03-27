package com.trandreluis.money.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.trandreluis.money.api.model.Pessoa;
import com.trandreluis.money.api.repository.PessoaRepository;
import com.trandreluis.money.api.repository.filter.PessoaFilter;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa atualizar(Long id, Pessoa pessoa) {
		Pessoa pessoaSalva = buscarPessoaPeloId(id);
		BeanUtils.copyProperties(pessoa, pessoaSalva, "id");
		pessoaRepository.save(pessoaSalva);
		return pessoaSalva;
	}

	public Pessoa atualizarPropriedadeAtivo(Long id, Boolean ativo) {
		Pessoa pessoaSalva = buscarPessoaPeloId(id);
		pessoaSalva.setAtivo(ativo);
		return pessoaRepository.save(pessoaSalva);
	}

	public Pessoa buscarPessoaPeloId(Long id) {
		Pessoa pessoaSalva = pessoaRepository.findOne(id);
		if (pessoaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva;
	}

	public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable) {
		return pessoaRepository.filtrar(pessoaFilter, pageable);
	}

}