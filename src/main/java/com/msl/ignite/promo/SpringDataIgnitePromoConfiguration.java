package com.msl.ignite.promo;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.springdata.repository.config.EnableIgniteRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.msl.ignite.promo.entity.Promocion;

@Configuration
@EnableIgniteRepositories
public class SpringDataIgnitePromoConfiguration {

	static final Logger logger = LoggerFactory.getLogger(SpringDataIgnitePromoConfiguration.class);
	static Ignite igniteInstance = null;
    
	/**
     * Creating Apache Ignite instance bean. A bean will be passed
     * to IgniteRepositoryFactoryBean to initialize all Ignite based Spring Data      
     * repositories and connect to a cluster.
     */
    @Bean
    public synchronized Ignite igniteInstance() {
    	if(igniteInstance == null) {
	        IgniteConfiguration cfg = new IgniteConfiguration();
	
	        // Setting some custom name for the node.
	        cfg.setIgniteInstanceName("promocionRepositorySpringDataNode");
	
	        // Enabling peer-class loading feature.
	        cfg.setPeerClassLoadingEnabled(true);
	
	        // Defining and creating a new cache to be used by Ignite Spring Data
	        // repository.
	        CacheConfiguration ccfg = new CacheConfiguration("promocionRepository");
	
	
	
	        // Setting SQL schema for the cache.
	        ccfg.setIndexedTypes(String.class, Promocion.class);
	
	        cfg.setCacheConfiguration(ccfg);
	        igniteInstance = Ignition.start(cfg);
    	}

        return igniteInstance;
    }
}
