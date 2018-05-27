package com.msl.ignite.promo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msl.ignite.promo.entity.Producto;
import com.msl.ignite.promo.entity.Promocion;
import com.msl.ignite.promo.loader.ProductoLoader;
import com.msl.ignite.promo.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	ProductoRepository repository;
	
	@Autowired
	ProductoLoader loader;
	
    public Optional<Producto> findByid(String id){
    	return repository.findById(id);
    }
    
    public Iterable<Producto> findByReferencia(String referencia){
    	return repository.findByReferencia(referencia);
    }
    
    public Producto findByName(String name){
    	return repository.findByName(name);
    }
    
    public Iterable<Promocion> findPromocionesById(String id){
    	return repository.findPromocionesById(id);
    }
    
    public Iterable<Promocion> findPromocionesByName(String name){
    	return repository.findPromocionesByName(name);
    }
    
    public Iterable<Promocion> findPromocionesByReferencia(String referencia){
    	return repository.findPromocionesByReferencia(referencia);
    }

	public Producto save(Producto product) {
		return repository.save(product);
	}
	public void add(int numProductos) {
		loader.add(numProductos);
	}
}
