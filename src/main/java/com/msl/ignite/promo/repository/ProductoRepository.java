package com.msl.ignite.promo.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.Query;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

import com.msl.ignite.promo.entity.Producto;
import com.msl.ignite.promo.entity.Promocion;

@RepositoryConfig(cacheName = "ProductoRepository")
public interface ProductoRepository extends IgniteRepository<Producto,String> {
	public Optional<Producto> findById(String id);
	public Iterable<Producto> findByReferencia(String referencia);
	public Producto findByName(String name);
	public List<Producto> findAll();
	Iterable<Promocion> findPromocionesById(String id);
	Iterable<Promocion> findPromocionesByName(String name);
	Iterable<Promocion> findPromocionesByReferencia(String referencia);
	@Query("{}")
	public Stream<Producto> findAllAsStream();
}