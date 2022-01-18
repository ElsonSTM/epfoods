package com.epsystem.epfood.domain.repository;

import java.math.BigDecimal;
import java.util.List;

import com.epsystem.epfood.domain.entity.Restaurante;

public interface RestauranteRepositpryQueries {

	List<Restaurante> find(String nome, BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal);

}