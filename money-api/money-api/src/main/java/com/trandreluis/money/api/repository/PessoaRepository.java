package com.trandreluis.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trandreluis.money.api.model.Pessoa;
import com.trandreluis.money.api.repository.pessoa.PessoaRepositoryQuery;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {

}