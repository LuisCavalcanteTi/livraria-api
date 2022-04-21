package com.luiscavalcante.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luiscavalcante.livraria.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

	 
	
	
}
