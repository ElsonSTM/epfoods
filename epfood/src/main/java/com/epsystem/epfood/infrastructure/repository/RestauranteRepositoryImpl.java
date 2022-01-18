package com.epsystem.epfood.infrastructure.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.epsystem.epfood.domain.entity.Restaurante;
import com.epsystem.epfood.domain.repository.RestauranteRepositpryQueries;



@Repository
public class RestauranteRepositoryImpl implements RestauranteRepositpryQueries {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Restaurante> find(String nome, BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal){
		
		var jpql = "from Restaurante where nome like :nome and taxaFrete between :taxaInicial and :taxaFinal";
		
		return manager.createQuery(jpql, Restaurante.class)
				.setParameter("nome","%" + nome + "%")
				.setParameter("taxainicial", taxaFreteInicial)
				.setParameter("TaxaFinal", taxaFreteFinal)
				.getResultList();
	}
		
}
