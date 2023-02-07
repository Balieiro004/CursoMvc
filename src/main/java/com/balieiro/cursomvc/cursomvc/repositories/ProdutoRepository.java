package com.balieiro.cursomvc.cursomvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balieiro.cursomvc.cursomvc.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
