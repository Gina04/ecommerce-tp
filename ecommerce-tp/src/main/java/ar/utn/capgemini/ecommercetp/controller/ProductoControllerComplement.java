package ar.utn.capgemini.ecommercetp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ar.utn.capgemini.ecommercetp.model.producto.Producto;

//@RepositoryRestController
public class ProductoControllerComplement {
	
	@DeleteMapping("/producto/{productoId}")
	public String darDeBajaProducto(@PathVariable("productoId") Producto producto) {
		return "no paso nada";
	}

}
