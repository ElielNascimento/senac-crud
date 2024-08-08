package com.crud.demo.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.entidades.pessoaEntidade;
import com.crud.demo.servicos.PessoaServico;

@RequestMapping("/api")
@RestController
public class PessoaControle {
	
	@Autowired
	private PessoaServico pessoaServico;
	
	@GetMapping
	private List<pessoaEntidade> findAll(){
		return pessoaServico.findAll();
	}
	
	@PostMapping
	private pessoaEntidade Criar(@RequestBody pessoaEntidade p) {
		return pessoaServico.Criar(p);
	}
	
}
