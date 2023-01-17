package ar.utn.capgemini.ecommercetp.model.producto;

import ar.utn.capgemini.ecommercetp.model.EntidadPersistente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categoriaProducto")
@Setter
@Getter
public class CategoriaProducto extends EntidadPersistente{
	@Column(name = "categoria")
	private String categoria;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
		
}
