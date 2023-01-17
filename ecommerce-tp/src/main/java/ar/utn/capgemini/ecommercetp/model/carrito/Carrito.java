package ar.utn.capgemini.ecommercetp.model.carrito;

import java.util.ArrayList;
import java.util.List;

import ar.utn.capgemini.ecommercetp.model.DireccionComprador;
import ar.utn.capgemini.ecommercetp.model.EntidadPersistente;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrito")
public class Carrito extends EntidadPersistente{
	//carrito puede tener muchos items. TODO: agrego como coleccion
	@OneToMany
	@JoinColumn(name = "item_id", referencedColumnName = "id")
	private List<Item> items;
	
	private int precioTotalCompra; 
	
	@Embedded
	private DireccionComprador direccion;
	
	public Carrito() {
		this.items=new ArrayList<>();
	}
	

}
