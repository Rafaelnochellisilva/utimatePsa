package br.com.ultmatePsa.pessoa;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;

import br.com.ultmatePsa.ids.EnderecoId;

public class Endereco {
	@AttributeOverride(name = "id", column = @Column(name = "endereco_id") )
	private EnderecoId id;
	private String lograouro;
	private String numero;
	private String cep;
	private String bairro;
	private Cidade cidade;

}
