package com.msl.ignite.promo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.msl.ignite.promo.loader.DBLoaderCLRunner;
import com.msl.ignite.promo.repository.ProductoRepository;

@SpringBootApplication
public class SpringDataIgnitePromoApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringDataIgnitePromoApplication.class);
	public final static String name = "MongoDB Promo";
	
	public static void main(final String... args) {
		logger.info("Iniciando aplicacion" + name);
		init();
//		Object[] runner = new Object[] {DBLoaderCLRunner.class};
		SpringApplication.run(DBLoaderCLRunner.class, args);
//		SpringApplication.run(SpringDataIgnitePromoApplication.class, args);
//		System.exit(SpringApplication.exit(SpringApplication.run(runner, args)));
		logger.info("Aplicacion " + name + " iniciada");
	}
	
	private static void init() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		// Explicitly registering Spring configuration.
		ctx.register(SpringDataIgnitePromoConfiguration.class);

		ctx.refresh();

		// Getting a reference to PersonRepository.
		ProductoRepository repo = ctx.getBean(ProductoRepository.class);
	}
}
