package com.epsystem.epfood.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epsystem.epfood.domain.entity.Cozinha;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {
	
	List<Cozinha> findTodasByNome(String nome);
	
	Optional<Cozinha> findByNome(String nome);
}
