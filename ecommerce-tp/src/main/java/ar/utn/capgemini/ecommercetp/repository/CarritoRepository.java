package ar.utn.capgemini.ecommercetp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.utn.capgemini.ecommercetp.model.carrito.Carrito;
import ar.utn.capgemini.ecommercetp.model.producto.Producto;

@RepositoryRestResource(path="carrito")
public interface CarritoRepository extends JpaRepository<Carrito, Integer>  {
     //eliminar producto carrito
	
	//agregar producto al carrito
	
	
}
