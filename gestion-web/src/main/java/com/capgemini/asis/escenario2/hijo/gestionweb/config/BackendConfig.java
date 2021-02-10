package com.capgemini.asis.escenario2.hijo.gestionweb.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

/*
 * Clase de configuracion de Spring
 */
@Configuration
/*
 * Habilitar escaneo de componentes de Spring indicando el paquete base
 */

@ComponentScan(basePackages = { "com.capgemini.asis.escenario2.hijo.gestionmodel.entidades",
		"com.capgemini.asis.escenario2.hijo.gestionmodel.repositorios",
		"com.capgemini.asis.escenario2.hijo.gestionmodel.servicios" })
public class BackendConfig {
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		LocalEntityManagerFactoryBean factory = new LocalEntityManagerFactoryBean();

		/*
		 * Cargar la unidad de persistencia del fichero persistence.xml
		 * 
		 * jpa-mysql => MySQL
		 * 
		 * jpa-h2 => H2
		 */
		factory.setPersistenceUnitName("jpa-mysql" /* "jpa-h2" */);

		return factory;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager txManager = new JpaTransactionManager();

		txManager.setEntityManagerFactory(entityManagerFactory);

		return txManager;
	}

}
