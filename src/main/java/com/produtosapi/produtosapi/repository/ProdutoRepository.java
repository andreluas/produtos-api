package com.produtosapi.produtosapi.repository;

import com.produtosapi.produtosapi.models.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}