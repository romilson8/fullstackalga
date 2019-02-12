package com.accenture.moneyapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.moneyapi.model.Lancamento;
import com.accenture.moneyapi.repository.filter.LancamentoFilter;
import com.accenture.moneyapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

	Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

}
