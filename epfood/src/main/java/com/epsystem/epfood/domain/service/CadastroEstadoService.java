package com.epsystem.epfood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;

import com.epsystem.epfood.domain.entity.Estado;
import com.epsystem.epfood.domain.exception.EntidadeEmUsoException;
import com.epsystem.epfood.domain.exception.EntidadeNaoEncontradaException;
import com.epsystem.epfood.domain.repository.EstadoRepository;

public class CadastroEstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public Estado salvar(Estado estado) {
		return estadoRepository.salvar(estado);
	}
	
	public void excluir(Long estadoId) {
		try {
				estadoRepository.remover(estadoId);;
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe um cadastro de estado com esse código d%", estadoId));
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Estado de código %d não pode ser removido, pois está em uso", estadoId));
		}
	}

}
