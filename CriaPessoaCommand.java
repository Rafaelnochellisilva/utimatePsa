package br.com.ultmatePsa.command;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.ultmatePsa.pessoa.Sexo;

public class CriaPessoaCommand {
	private String nome;	
	private Calendar dataDeNascimento;	
	private Sexo sexo;
	private String lograouro;
	private String numero;
	private String cep;
	private String nomeCidade;
	private String nomeEstado;
	private String numeroCelular;
	private String numeroFixo;
	private String papel;
	private String tipoPessoa;
	private String documento;
	@JsonCreator
	public CriaPessoaCommand(@JsonProperty(value = "nome")String nome,@JsonProperty(value = "dataDeNascimento") Calendar dataDeNascimento,
			                 @JsonProperty(value = "sexo") Sexo sexo,@JsonProperty(value = "logradouro") String lograouro,
			                 @JsonProperty(value = "numero") String numero,@JsonProperty(value = "cep")String cep,
			                 @JsonProperty(value = "nomeCidade") String nomeCidade,@JsonProperty(value = "nomeEstado") String nomeEstado,
			                 @JsonProperty(value = "numeroCelular") String numeroCelular,@JsonProperty(value = "numeroFixo") String numeroFixo,
			                 @JsonProperty(value = "papel") String papel,@JsonProperty(value = "tipoPessoa")String tipoPessoa,
			                 @JsonProperty(value = "documento")String documento) {
	
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.lograouro = lograouro;
		this.numero = numero;
		this.cep = cep;
		this.nomeCidade = nomeCidade;
		this.nomeEstado = nomeEstado;
		this.numeroCelular = numeroCelular;
		this.numeroFixo = numeroFixo;
		this.papel = papel;
		this.tipoPessoa = tipoPessoa;
		this.documento =documento;
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
	public String getLograouro() {
		return lograouro;
	}
	public String getNumero() {
		return numero;
	}
	public String getCep() {
		return cep;
	}
	public String getNomeCidade() {
		return nomeCidade;
	}
	public String getNomeEstado() {
		return nomeEstado;
	}
	public String getNumeroCelular() {
		return numeroCelular;
	}
	public String getNumeroFixo() {
		return numeroFixo;
	}
	public String getPapel() {
		return papel;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public String getDocumento() {
		return documento;
	}
	
	
	
	
	
}
