package br.com.ultmatePsa.pessoa;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;

import br.com.ultmatePsa.ids.CidadeId;
import br.com.ultmatePsa.ids.EstadoId;
import br.com.ultmatePsa.util.ValidacaoDeString;

public class Cidade {
	@AttributeOverride(name = "id", column = @Column(name = "cidade_id") )
	private CidadeId id;
	@AttributeOverride(name = "nomeCidade", column = @Column(name = "nome_cidade") )
	private String nomeCidade;	
	@AttributeOverride(name = "id", column = @Column(name = "estado_id") )
	private EstadoId estadoId;	

	private Cidade() {
		id =new CidadeId();
	}

	public Cidade(EstadoId estadoId, String nomeCidade) {
		this();
		ValidacaoDeString.isNull(estadoId.toString());
		ValidacaoDeString.isNullOrEmpty(nomeCidade);
		this.estadoId = estadoId;
		this.nomeCidade = nomeCidade;
	}

	public CidadeId getId() {
		return id;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public EstadoId getEstadoId() {
		return estadoId;
	}
	

	
}
