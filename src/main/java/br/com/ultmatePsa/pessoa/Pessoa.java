package br.com.ultmatePsa.pessoa;

import java.util.Calendar;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.ultmatePsa.ids.PessoaId;

@Entity
@Table(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
	@Id
	private PessoaId id;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Calendar dataDeNascimento;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	private Endereco endereco;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Telefone> telefones;

	public Pessoa() {
		
	}

	public Pessoa(PessoaId id, String nome, Calendar dataDeNascimento, Sexo sexo, Endereco endereco,
			Set<Telefone> telefones) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.endereco = endereco;
		this.telefones = telefones;
	}

}
