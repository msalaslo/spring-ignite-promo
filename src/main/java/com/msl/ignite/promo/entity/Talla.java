package com.msl.ignite.promo.entity;

import org.springframework.data.annotation.Id;

//@Document(collection="talla")
public class Talla {
	
	@Id
    public String id;
	
//	@Indexed
	public String ctallaec;
	
	public Talla(String ctallaec) {
		super();
		this.ctallaec = ctallaec;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCtallaec() {
		return ctallaec;
	}

	public void setCtallaec(String ctallaec) {
		this.ctallaec = ctallaec;
	}

}
