package com.msl.ignite.promo.entity;

import org.springframework.data.annotation.Id;

//@Document(collection="departamento")
public class Departamento {
	
	@Id
    public String id;
	
//	@Indexed
	public String cdepartm;
	
	public Departamento(String cdepartm) {
		super();
		this.cdepartm = cdepartm;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCdepartm() {
		return cdepartm;
	}

	public void setCdepartm(String cdepartm) {
		this.cdepartm = cdepartm;
	}





}
