package com.generation.farmacia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Produto;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public Optional<Produto> findByTitulo(String titulo);
	public List <Produto> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}