package br.com.ultmatePsa.pessoa;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import br.com.ultmatePsa.ids.EnderecoId;
import br.com.ultmatePsa.ids.PessoaId;

public class PessoaJuridica extends Pessoa {
	private Cnpj cnpj;
	private String inscricaoEstadual;

	public PessoaJuridica() {

	}

	public PessoaJuridica(Cnpj cnpj, String inscricaoEstadual) {
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public PessoaJuridica(PessoaId id, String nome, Calendar dataDeNascimento, Sexo sexo, EnderecoId endereco,
			Set<Telefone> telefones, List<Papel> papeis) {
		super(id, nome, dataDeNascimento, sexo, endereco, telefones, papeis);

	}

	public Cnpj getCnpj() {
		return cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	
}
