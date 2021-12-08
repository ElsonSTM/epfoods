package com.epsystem.epfood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.epsystem.epfood.EpfoodApplication;
import com.epsystem.epfood.domain.entity.Restaurante;
import com.epsystem.epfood.domain.repository.RestauranteRepository;

public class ConsultaRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(EpfoodApplication.class) 
			.web(WebApplicationType.NONE)
			.run(args);
		
		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		List<Restaurante> restaurantes = restauranteRepository.listar();
		
		for(Restaurante restaurante : restaurantes) {
			System.out.printf("%s - %f - %s \n", 
					restaurante.getNome(), 
					restaurante.getTaxaFrete(), 
					restaurante.getNome());
		}
	}
}
