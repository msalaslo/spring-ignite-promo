package com.msl.ignite.promo.repository;

import java.util.Optional;

import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

import com.msl.ignite.promo.entity.Centro;
import com.msl.ignite.promo.entity.Promocion;

@RepositoryConfig(cacheName = "CentroRepository")
public interface CentroRepository extends IgniteRepository<Centro,String> {
	public Optional<Centro> findById(String id);
	public Iterable<Centro> findByCentroo(String centroo);
	public Iterable<Centro> findByName(String centroo);
	public Iterable<Promocion> findPromocionesByCentroo(String centroo);
	public Iterable<Promocion> findPromocionesById(String id);
	public Iterable<Promocion> findPromocionesByName(String name);
}