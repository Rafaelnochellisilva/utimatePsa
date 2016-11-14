package br.com.ultmatePsa.pessoa;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

import br.com.ultmatePsa.ids.EnderecoId;
import br.com.ultmatePsa.ids.PessoaId;
@Entity
public class PessoaFisica extends Pessoa {
	private Cpf cpf;

	public PessoaFisica() {
				
	}
	

	public PessoaFisica(Cpf cpf) {		
		this.cpf = cpf;
	}


	public PessoaFisica(PessoaId id, String nome, Calendar dataDeNascimento, Sexo sexo, EnderecoId endereco,
			Set<Telefone> telefones, List<Papel> papeis) {
		super(id, nome, dataDeNascimento, sexo, endereco, telefones, papeis);
	
	}


	public Cpf getCpf() {
		return cpf;
	}
	
	


	
	
	
}
