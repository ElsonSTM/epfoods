package com.epsystem.epfood.domain.repository;

import java.util.List;

import com.epsystem.epfood.domain.entity.Estado;

public interface EstadoRepository {

	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Long id);
}
