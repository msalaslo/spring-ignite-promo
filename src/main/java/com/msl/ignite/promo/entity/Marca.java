package com.msl.ignite.promo.entity;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;

//@Document(collection="marca")
public class Marca implements Promocionable, Relacionable, RelacionableParent{
			
	@Id
	public String id;
		
//	@Indexed
	private String cmarmuma;
				
//	@Relations(edges = MarcaPromocion.class, lazy = true)
//	@DBRef
	public List<Promocion> promociones;
	
	private String name; 
	
	public Marca() {
		super();
	}
	
	public Marca(String cmarmuma, String name) {
		super();
		this.cmarmuma = cmarmuma;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(List<Promocion> promociones) {
		this.promociones = promociones;
	}

	public String getCmarmuma() {
		return cmarmuma;
	}

	public void setCmarmuma(String cmarmuma) {
		this.cmarmuma = cmarmuma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this).
        		append("id", id).
                append("cmarmuma", cmarmuma).
                append("name", name).
                append("promociones", promociones).
        		toString();
    }
}
