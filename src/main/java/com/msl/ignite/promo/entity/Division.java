package com.msl.ignite.promo.entity;

import org.springframework.data.annotation.Id;

//@Document(collection="division")
public class Division {
	
	@Id
    public String id;
	
//	@Indexed
	public String cdivisio;
	
	public Division(String cdivisio) {
		super();
		this.cdivisio = cdivisio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCdivisio() {
		return cdivisio;
	}

	public void setCdivisio(String cdivisio) {
		this.cdivisio = cdivisio;
	}

}
