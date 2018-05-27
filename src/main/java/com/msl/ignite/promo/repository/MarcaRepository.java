package com.msl.ignite.promo.repository;

import java.util.Optional;

import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

import com.msl.ignite.promo.entity.Marca;
import com.msl.ignite.promo.entity.Promocion;

@RepositoryConfig(cacheName = "MarcaRepository")
public interface MarcaRepository extends IgniteRepository<Marca,String> {
	public Optional<Marca> findById(String id);
	public Iterable<Marca> findByCmarmuma(String cmarmuma);
	public Iterable<Marca> findByName(String name);
	public Iterable<Promocion> findPromocionesById(String id);
	public Iterable<Promocion> findPromocionesByName(String name);
	public Iterable<Promocion> findPromocionesByCmarmuma(String cmarmuma);
}