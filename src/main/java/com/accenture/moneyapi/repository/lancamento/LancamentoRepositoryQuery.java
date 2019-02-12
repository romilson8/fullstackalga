package com.accenture.moneyapi.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.accenture.moneyapi.model.Lancamento;
import com.accenture.moneyapi.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

}
