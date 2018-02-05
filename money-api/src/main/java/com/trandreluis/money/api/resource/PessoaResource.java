package com.trandreluis.money.api.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.trandreluis.money.api.repository.PessoaRepository;
import com.trandreluis.money.api.model.Pessoa;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping
	public List<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> criar(@Valid @RequestBody Pessoa pessoa, HttpServletResponse response) {
		Pessoa pessoaSalva = pessoaRepository.save(pessoa);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(pessoaSalva.getId()).toUri();
		
		return ResponseEntity.created(uri).body(pessoaSalva);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> buscarPeloId(@PathVariable Long id) {
		Pessoa pessoaEncontrada = pessoaRepository.findOne(id);
		if(pessoaEncontrada == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(pessoaEncontrada);
	}
	
}