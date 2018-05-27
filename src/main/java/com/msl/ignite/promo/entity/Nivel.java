package com.msl.ignite.promo.entity;

import org.springframework.data.annotation.Id;

//@Document(collection="nivel")
public class Nivel {
	
	@Id
    public String id;
	
//	@Indexed
	public String cniveln;
	
	public Nivel(String cniveln) {
		super();
		this.cniveln = cniveln;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCniveln() {
		return cniveln;
	}

	public void setCniveln(String cniveln) {
		this.cniveln = cniveln;
	}

}
