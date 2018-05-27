package com.msl.ignite.promo.repository;

import java.util.Optional;

import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

import com.msl.ignite.promo.entity.Empresa;
import com.msl.ignite.promo.entity.Promocion;

@RepositoryConfig(cacheName = "EmpresaRepository")
public interface EmpresaRepository extends IgniteRepository<Empresa,String> {
	public Optional<Empresa> findById(String id);
	public Iterable<Empresa> findByCempresa(String cempresa);
	public Iterable<Empresa> findByName(String cempresa);
	public Iterable<Promocion> findPromocionesByCempresa(String cempresa);
	public Iterable<Promocion> findPromocionesById(String id);
	public Iterable<Promocion> findPromocionesByName(String name);
}