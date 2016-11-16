package br.com.ultmatePsa.service;

import org.springframework.stereotype.Service;

import br.com.ultmatePsa.command.CriaPessoaCommand;
import br.com.ultmatePsa.pessoa.Endereco;

@Service
public class PessoaService {

	public void cadastrar(CriaPessoaCommand command) {
		Endereco endereco;
		
		try {
			endereco = new Endereco();
			
			
		} catch (Exception e) {
			
		}
		
	}

}
