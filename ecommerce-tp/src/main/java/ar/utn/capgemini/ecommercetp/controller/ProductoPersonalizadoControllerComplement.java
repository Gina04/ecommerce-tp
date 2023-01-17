package ar.utn.capgemini.ecommercetp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.utn.capgemini.ecommercetp.model.vendedor.PersonalizacionConcreta;
import ar.utn.capgemini.ecommercetp.repository.ProductoPersonalizadoRepository;
import jakarta.transaction.Transactional;

@RepositoryRestController
public class ProductoPersonalizadoControllerComplement {
	@Autowired
	ProductoPersonalizadoRepository repo;
	
	@Transactional
	@DeleteMapping(path = "/productosPersonalizados/{productoPersonalizadoId}")
	public @ResponseBody ResponseEntity<PersonalizacionConcreta> darDeBajaProductoPersonalizado(@PathVariable("productoPersonalizadoId") Integer productoPerId) {
		if(repo.existsById(productoPerId)) {
			PersonalizacionConcreta productoPersonalizado = repo.findById(productoPerId).get();
			productoPersonalizado.setActivo(false);
			
			return new ResponseEntity<PersonalizacionConcreta>(productoPersonalizado, HttpStatus.OK);
		}else {
			return ResponseEntity.notFound().build();
		}
		
		
	}
}
