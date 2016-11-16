package br.com.ultmatePsa.pessoa;

import br.com.ultmatePsa.ids.EnderecoId;

public class Endereco {
	private EnderecoId id;
	private String lograouro;
	private String numero;
	private String cep;
	private String bairro;
	private Cidade cidade;
	
	public Endereco() {
		id =new EnderecoId();
	}

	public Endereco(String lograouro, String numero, String cep, String bairro, Cidade cidade) {			
		this.lograouro = lograouro;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	

}
