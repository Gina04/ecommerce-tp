package ar.utn.capgemini.ecommercetp.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import ar.utn.capgemini.ecommercetp.model.vendedor.PersonalizacionConcreta;


@RepositoryRestResource(path = "productosPersonalizados")
public interface ProductoPersonalizadoRepository extends JpaRepository<PersonalizacionConcreta, Integer> {
	/*
	@RestResource(exported=false)
	@Override
	void deleteById(Integer id);
	
	@RestResource(exported=false)
	@Override
	void delete(PersonalizacionConcreta entity);
	*/
	
	public List<PersonalizacionConcreta> findByNombre(String nombreProd);
}
