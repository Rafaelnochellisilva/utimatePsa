package br.com.ultmatePsa.pessoa;

import javax.persistence.AttributeOverride;
import javax.persistence.Entity;
import javax.persistence.Column;

import br.com.ultmatePsa.ids.CidadeId;
import br.com.ultmatePsa.ids.EstadoId;
@Entity
public class Cidade {	
	private CidadeId id;
	@AttributeOverride(name = "id", column = @Column(name = "estado_id") )
	private EstadoId idEstado;
	private String nomeCidade;
	public Cidade() {
		id =new CidadeId();
	}
	public Cidade(EstadoId idEstado, String nomeCidade) {
		this();
		this.idEstado = idEstado;
		this.nomeCidade = nomeCidade;
	}
	public CidadeId getId() {
		return id;
	}
	public EstadoId getIdEstado() {
		return idEstado;
	}
	public String getNomeCidade() {
		return nomeCidade;
	}
	
	
	
	
	
	
}
