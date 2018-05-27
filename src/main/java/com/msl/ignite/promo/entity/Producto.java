package com.msl.ignite.promo.entity;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;

//@Document(collection="producto")
public class Producto implements Promocionable,Relacionable{
	@Id
	public String id;

//	@Indexed
	public String referencia;

	public String name;

	// @Relations(edges = ProductoPromocion.class, lazy = true)
//	@DBRef
	private List<Promocion> promociones;

	// @Relations(edges = ProductoMarca.class, lazy = true)
//	@DBRef
	private Marca marca;
	
//	@DBRef
	private Familia familia;
	
//	@DBRef
	private Centro centro;

	public Producto(String referencia, String name) {
		super();
		this.referencia = referencia;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

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

	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public Centro getCentro() {
		return centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this).
        		append("PRODUCTO:" + name).
        		append("id", id).
                append("referencia", referencia).
                append("promociones", promociones).
          	    append("marca", marca).
        		toString();
	}
}
