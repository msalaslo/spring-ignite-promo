package com.msl.ignite.promo.loader;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.msl.ignite.promo.entity.EntityUtils;
import com.msl.ignite.promo.entity.Familia;
import com.msl.ignite.promo.entity.Producto;
import com.msl.ignite.promo.entity.Relacionable;
import com.msl.ignite.promo.entity.RelacionableParent;
import com.msl.ignite.promo.repository.FamiliaRepository;
import com.msl.ignite.promo.repository.ProductoRepository;


@Component
public class ProductoFamiliaRelationsLoader extends AbstractRelacionableRepositoryLoader implements IRelacionableRepositoryLoader{
	@Autowired
	private ProductoRepository productoRepo;
	
	@Autowired
	private FamiliaRepository familiaRepo;
		
	@Override
	public void loadRelaciones() {
		super.loadRelaciones(EntityUtils.toRelacionable(productoRepo.findAll()), EntityUtils.toRelacionableParent(familiaRepo.findAll()));
	}
	
	@Override
	public void deleteRelaciones() {
		List<Producto> productos = productoRepo.findAll();
		for (Producto producto : productos) {
			Familia familiasProd = producto.getFamilia();
			if(familiasProd != null) {
				producto.setFamilia(null);
				productoRepo.save(producto);
			}
		}
	}

	@Override
	public void save(Relacionable relacionable, RelacionableParent parent) {
		Producto producto = (Producto)relacionable;
		producto.setFamilia((Familia)parent);
		productoRepo.save(producto);
	}
}
