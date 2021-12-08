package com.epsystem.epfood.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
public class Estado {

	@EqualsAndHashCode.Include
	@Id
	private Long id;
	
	private String nome;
	
}
