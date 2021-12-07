package com.epsystem.epfood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.epsystem.epfood.EpfoodApplication;
import com.epsystem.epfood.domain.entity.Cozinha;

public class AlteracaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(EpfoodApplication.class) 
			.web(WebApplicationType.NONE)
			.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setId(1L);	
		
		cadastroCozinha.remover(cozinha1);
	}
}
