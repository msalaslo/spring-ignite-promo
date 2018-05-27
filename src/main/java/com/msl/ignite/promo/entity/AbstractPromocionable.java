package com.msl.ignite.promo.entity;

import java.util.List;

public abstract class AbstractPromocionable implements Promocionable {
	
	private String name;
	
	// @Relations(edges = ProductoPromocion.class, lazy = true)
//	@DBRef
	private List<Promocion> promociones;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(List<Promocion> promociones) {
		this.promociones = promociones;
	}
	
//	public abstract List<Promocion> getPromociones();
//
//	public abstract void setPromociones(List<Promocion> promociones);
}
