package com.msl.ignite.promo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msl.ignite.promo.entity.Marca;
import com.msl.ignite.promo.entity.Promocion;
import com.msl.ignite.promo.repository.MarcaRepository;

@Service
public class MarcaService {

	@Autowired
	MarcaRepository repository;
	
    public Optional<Marca> findByid(String id){
    	return repository.findById(id);
    }
    
    public Iterable<Marca> findByName(String name){
    	return repository.findByName(name);
    }
    
    public Iterable<Marca> findByCmarmuma(String cmarmuma){
    	return repository.findByCmarmuma(cmarmuma);
    }
    
    public Iterable<Promocion> findPromocionesById(String id){
    	return repository.findPromocionesById(id);
    }
    
    public Iterable<Promocion> findPromocionesByCmarmuma(String cmarmuma){
    	return repository.findPromocionesByCmarmuma(cmarmuma);
    }
    
    public Iterable<Promocion> findPromocionesByName(String name){
    	return repository.findPromocionesByName(name);
    }

	public Marca save(Marca product) {
		return repository.save(product);
	}
}
