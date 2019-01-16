package com.accenture.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.moneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
