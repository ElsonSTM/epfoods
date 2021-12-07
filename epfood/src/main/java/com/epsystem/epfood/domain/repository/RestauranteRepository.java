package com.epsystem.epfood.domain.repository;

import java.util.List;

import com.epsystem.epfood.domain.entity.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Restaurante restaurante);
}
