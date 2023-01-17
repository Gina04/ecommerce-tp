package ar.utn.capgemini.ecommercetp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import ar.utn.capgemini.ecommercetp.model.producto.Producto;
import jakarta.persistence.EntityManager;

@RepositoryRestResource(path="productos")
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	

}
