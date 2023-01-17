package ar.utn.capgemini.ecommercetp.model.producto;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import ar.utn.capgemini.ecommercetp.model.EntidadPersistente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "areaPersonalizaciones")
public class AreaPersonalizacion extends EntidadPersistente {
	@Column(name = "area")
	private String area;
	
	@ManyToOne
	@JoinColumn(name = "tipo_personalizacion_id", referencedColumnName = "id")
	private Personalizacion personalizacion;
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Personalizacion getPersonalizacion() {
		return personalizacion;
	}

	public void setPersonalizacion(Personalizacion personalizacion) {
		this.personalizacion = personalizacion;
	}
		
}
