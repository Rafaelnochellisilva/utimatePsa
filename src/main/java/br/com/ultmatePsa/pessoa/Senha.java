package br.com.ultmatePsa.pessoa;

import javax.persistence.Embeddable;

import br.com.ultmatePsa.exception.SenhaTamanhoMinimoException;
import br.com.ultmatePsa.util.ValidacaoDeString;

@Embeddable
public class Senha {
private final int TAMANHO_MINIMO = 6;
	
	private String value;
	
	private Senha() {

	}
	
	public Senha(String value) throws SenhaTamanhoMinimoException{	
		this();
		setSenha(value);
	}	
	
	public void setSenha(String value) throws SenhaTamanhoMinimoException{
		ValidacaoDeString.isNullOrEmpty(value);
		if(value.length()< TAMANHO_MINIMO){
			throw new SenhaTamanhoMinimoException();
		}
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
}
