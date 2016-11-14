package br.com.ultmatePsa.ids;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Embeddable
public abstract class IdBasico implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;

	public IdBasico(String id) {
		this.id = id;
	}

	public IdBasico() {
		id = UUID.randomUUID().toString();
	}

	public final String getValue() {
		return this.id;
	}

}
