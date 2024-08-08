package com.crud.demo.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.entidades.pessoaEntidade;
import com.crud.demo.repositorios.PessoaRepositorio;

@Service
public class PessoaServico {
	
	@Autowired
	public PessoaRepositorio pessoaRepositorio;

	public List<pessoaEntidade> findAll(){
		return pessoaRepositorio.findAll();
	}
	
	public pessoaEntidade Criar(pessoaEntidade p) {
		return pessoaRepositorio.save(p);
	}
	
	public void deletar(Long id) {
		 pessoaRepositorio.deleteById(id);
	}
	
}
