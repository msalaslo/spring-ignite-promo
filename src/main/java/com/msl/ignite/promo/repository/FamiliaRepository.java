package com.msl.ignite.promo.repository;

import java.util.Optional;

import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

import com.msl.ignite.promo.entity.Familia;
import com.msl.ignite.promo.entity.Promocion;

@RepositoryConfig(cacheName = "FamiliaRepository")
public interface FamiliaRepository extends IgniteRepository<Familia,String> {
	public Optional<Familia> findById(String id);
	public Iterable<Familia> findByCfamilia(String cfamilia);
	public Iterable<Familia> findByName(String name);
	Iterable<Promocion> findPromocionesById(String id);
	Iterable<Promocion> findPromocionesByName(String name);
	Iterable<Promocion> findPromocionesByCfamilia(String cfamilia);
}