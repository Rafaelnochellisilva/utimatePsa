package br.com.ultmatePsa.pessoa;

import javax.persistence.Embeddable;

@Embeddable
public class Telefone {
private String numero;
	
	public Telefone() {		
		
	}
	
	public String GetNumero(){
		return numero;
	}
}
