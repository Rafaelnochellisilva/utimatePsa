package br.com.ultmatePsa.pessoa;

import javax.persistence.Embeddable;

import br.com.ultmatePsa.ids.PapelId;
@Embeddable
public class Papel {
	private PapelId id;
	
	public Papel() {
		id =new PapelId();
	}

}
