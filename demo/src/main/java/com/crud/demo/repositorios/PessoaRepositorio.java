package com.crud.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo.entidades.pessoaEntidade;

public interface PessoaRepositorio extends JpaRepository<pessoaEntidade,
Long> {

	 
}
