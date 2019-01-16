package com.accenture.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.moneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
