package ar.utn.capgemini.ecommercetp.model.vendedor;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;

import ar.utn.capgemini.ecommercetp.model.EntidadPersistente;
import ar.utn.capgemini.ecommercetp.model.producto.Producto;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vendedor")
@Setter
@Getter
public class Vendedor extends EntidadPersistente {
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "medioDePago" )
	private MedioPago medioPago;
	
	@ElementCollection
	@CollectionTable(name = "productoPersonalizado", joinColumns= @JoinColumn(name = "productoPersonalizado_id") )
	private List<PersonalizacionConcreta> productosPersonalizados;
	
	
	@OneToOne
	@JoinColumn(name = "personalizacionConcreta_id")
	private PersonalizacionConcreta personalizacionConcreta;
	
	public Vendedor() {
		this.productosPersonalizados = new ArrayList<>();
	}
	
	
}
