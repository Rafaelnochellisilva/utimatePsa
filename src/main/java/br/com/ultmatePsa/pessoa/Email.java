package br.com.ultmatePsa.pessoa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Embeddable;

import br.com.ultmatePsa.exception.EmailFormatoException;
import br.com.ultmatePsa.util.ValidacaoDeString;
@Embeddable
public class Email {
	private String value;

	private Email() {

	}
	
	public Email(String value) throws EmailFormatoException{		
		this();
		setValue(value);
	}	
	
	public String getValue(){
		return value;
	}
	
	public void setValue(String value) throws EmailFormatoException{
		ValidacaoDeString.isNullOrEmpty(value);
		validarFormato(value);
		this.value = value;
	}
	
	private void validarFormato(String value) throws EmailFormatoException{
		Pattern pattern = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
		Matcher matcher = pattern.matcher(value);
		if (!matcher.find()) {
			throw new EmailFormatoException();
		}
	}
}
