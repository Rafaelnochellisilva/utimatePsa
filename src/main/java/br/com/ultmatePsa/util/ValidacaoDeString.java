package br.com.ultmatePsa.util;

public class ValidacaoDeString {
	public static void isNull(String string){
		if (string == null){
			throw new IllegalArgumentException("A String não pode ser nula");
		}
	}
	
	public static void isNullOrEmpty(String string){
		isNull(string);
		if(string.isEmpty()){
			throw new IllegalArgumentException("A String não pode ser vazia");
		}
	}
}
