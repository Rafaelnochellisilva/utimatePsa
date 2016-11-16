package br.com.ultmatePsa.exception;

public class SenhaTamanhoMinimoException extends Exception {	
	private static final long serialVersionUID = 1L;
	public SenhaTamanhoMinimoException() {
		super("A senha deve possuir mais que 6 caracteres");
	}

}
