package org.narbonneau.gestion.quittance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class GestionnaireQuittanceApplication {

	public static final Logger logger = LoggerFactory.getLogger(GestionnaireQuittanceApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(GestionnaireQuittanceApplication.class, args);
	}

}

