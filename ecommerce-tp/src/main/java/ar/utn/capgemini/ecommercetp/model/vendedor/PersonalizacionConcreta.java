package ar.utn.capgemini.ecommercetp.model.vendedor;

import ar.utn.capgemini.ecommercetp.model.EntidadPersistente;
import ar.utn.capgemini.ecommercetp.model.producto.Producto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "personalizacionConcreta")
public class PersonalizacionConcreta extends EntidadPersistente {
	@Column(name = "precio")
	private int precio;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precioFinal")
	private int precioFinal;
	
	@Column(name = "tipoPersonalizacionConcreta")
	private String tipoPersonalizacionConcreta;
	
	@ManyToOne
	@JoinColumn(name = "productoBase_id", referencedColumnName="id")
	private Producto productoBase;
	
	//cuando borro no me muestra este campo
	@Column(name = "activo")
	private boolean activo;
	
	public PersonalizacionConcreta() {
		super();
		this.activo= true;
	}
	

	public PersonalizacionConcreta(int precio, String nombre, int precioFinal, String tipoPersonalizacionConcreta,
			Producto productoBase) {
		this();
		this.precio = precio;
		this.nombre = nombre;
		this.precioFinal = precioFinal;
		this.tipoPersonalizacionConcreta = tipoPersonalizacionConcreta;
		this.productoBase = productoBase;
		
	}


	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(int precioFinal) {
		this.precioFinal = precioFinal;
	}

	public Producto getProductoBase() {
		return productoBase;
	}

	public void setProductoBase(Producto productoBase) {
		this.productoBase = productoBase;
	}
	

	public String getTipoPersonalizacionConcreta() {
		return tipoPersonalizacionConcreta;
	}
	

	public void setTipoPersonalizacionConcreta(String tipoPersonalizacionConcreta) {
		this.tipoPersonalizacionConcreta = tipoPersonalizacionConcreta;
	}

	
	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	

}
