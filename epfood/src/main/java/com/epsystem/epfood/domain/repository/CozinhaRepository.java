package com.epsystem.epfood.domain.repository;

import java.util.List;

import com.epsystem.epfood.domain.entity.Cozinha;

public interface CozinhaRepository {
	
	List<Cozinha> listar();
	List<Cozinha> consultarPorNome(String nome);
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Long id);
}
