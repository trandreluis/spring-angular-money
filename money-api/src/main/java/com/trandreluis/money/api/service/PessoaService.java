package com.trandreluis.money.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.trandreluis.money.api.model.Pessoa;
import com.trandreluis.money.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa atualizar(Long id, Pessoa pessoa) {
		Pessoa pessoaSalva = pessoaRepository.findOne(id);
		if (pessoaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		BeanUtils.copyProperties(pessoa, pessoaSalva, "id");
		pessoaRepository.save(pessoaSalva);
		return pessoaSalva;
	}

}