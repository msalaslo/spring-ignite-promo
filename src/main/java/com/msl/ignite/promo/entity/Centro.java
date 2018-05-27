package com.msl.ignite.promo.entity;

import org.springframework.data.annotation.Id;

//@Document(collection="centro")
public class Centro extends AbstractPromocionable implements Relacionable,RelacionableParent {
	
	@Id
    public String id;
	
//	@IndOexed
	public String centroo;
		
//	@DBRef
//	private List<Promocion> promociones;
//
//	
//	public List<Promocion> getPromociones() {
//		return promociones;
//	}
//
//	public void setPromociones(List<Promocion> promociones) {
//		this.promociones = promociones;
//	}
	
//	@DBRef
	private Empresa empresa;
	
	public Centro(String centroo, String name) {
		super();
		this.centroo = centroo;
		super.setName(name);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCentroo() {
		return centroo;
	}

	public void setCentroo(String centroo) {
		this.centroo = centroo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}



}
