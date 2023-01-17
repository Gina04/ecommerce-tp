package ar.utn.capgemini.ecommercetp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.utn.capgemini.ecommercetp.model.producto.Personalizacion;

@RepositoryRestResource(path = "personalizaciones")
public interface PersonalizacionRepository  extends JpaRepository<Personalizacion, Integer>  {

}
