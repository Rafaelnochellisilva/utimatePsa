package br.com.ultmatePsa.pessoa;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.ultmatePsa.ids.EnderecoId;
import br.com.ultmatePsa.ids.PessoaId;

@Entity
@Table(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
	@AttributeOverride(name = "id", column = @Column(name = "pessoa_id") )
	private PessoaId id;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Calendar dataDeNascimento;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	private EnderecoId endereco;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Telefone> telefones;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Papel>papeis;

	public Pessoa() {
		id = new PessoaId();
	}

	public Pessoa(PessoaId id, String nome, Calendar dataDeNascimento, Sexo sexo, EnderecoId endereco,
			Set<Telefone> telefones, List<Papel> papeis) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.endereco = endereco;
		this.telefones = telefones;
		this.papeis = papeis;
	}

	public PessoaId getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public EnderecoId getEndereco() {
		return endereco;
	}

	public Set<Telefone> getTelefones() {
		return telefones;
	}

	public List<Papel> getPapeis() {
		return papeis;
	}

	


	
	
	



}
