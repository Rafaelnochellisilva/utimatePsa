package br.com.ultmatePsa.exception;

public class EmailFormatoException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmailFormatoException() {
		super("Este formato de e-mail nã é valido");
	}
}
	
