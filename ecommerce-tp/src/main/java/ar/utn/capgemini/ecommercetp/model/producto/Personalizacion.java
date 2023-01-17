package ar.utn.capgemini.ecommercetp.model.producto;

import ar.utn.capgemini.ecommercetp.model.EntidadPersistente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "personalizacion")
public class Personalizacion extends EntidadPersistente{	
	
	@Column(name = "tipoPersonalizacion")
	private String tipo_personalizacion;

	public String getTipo_personalizacion() {
		return tipo_personalizacion;
	}

	public void setTipo_personalizacion(String tipo_personalizacion) {
		this.tipo_personalizacion = tipo_personalizacion;
	}
	
}
