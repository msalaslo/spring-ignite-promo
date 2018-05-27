package com.msl.ignite.promo.repository;

import java.util.List;

import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.msl.ignite.promo.entity.Promocion;
 
@RepositoryConfig(cacheName = "PromocionRepository")
public interface PromocionRepository extends IgniteRepository<Promocion,String> {
	public Promocion findByCodpromoci(String codpromoci);
    public List<Promocion> findByCanlvnta(String canlvnta);   
    public Page<Promocion> findAll(Pageable page);
}