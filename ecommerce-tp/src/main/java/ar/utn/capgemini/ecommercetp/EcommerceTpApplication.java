package ar.utn.capgemini.ecommercetp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.utn.capgemini.ecommercetp.model.producto.Producto;
import jakarta.persistence.EntityManager;

@SpringBootApplication
public class EcommerceTpApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EcommerceTpApplication.class, args);
		
	}

}
