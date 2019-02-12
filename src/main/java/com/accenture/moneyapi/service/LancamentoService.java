package com.accenture.moneyapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.moneyapi.model.Lancamento;
import com.accenture.moneyapi.model.Pessoa;
import com.accenture.moneyapi.repository.LancamentoRepository;
import com.accenture.moneyapi.repository.PessoaRepository;
import com.accenture.moneyapi.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());	
		if (pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}
	
	

}
