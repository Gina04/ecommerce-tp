package ar.utn.capgemini.ecommercetp.model.producto;




import ar.utn.capgemini.ecommercetp.model.EntidadPersistente;
import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;




@Entity
@Table(name = "producto")
public class Producto extends EntidadPersistente {
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion; 
	
	@Column(name = "precioBase")
	private int precioBase; 
	

	@Column(name = "tiempoFabricacion")
	private int tiempoFabricacion;
	
	@Column(name = "activo")
	private boolean activo;
	
	@ManyToOne
	@JoinColumn(name = "area_personalizacion_id", referencedColumnName = "id")
	private AreaPersonalizacion posiblesPersonalizaciones;
    
	@Enumerated(EnumType.STRING)
	@Column(name = "generoDeRopa")
	private GeneroRopa generoRopa;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "categoria_id")
	private CategoriaProducto categoriaProducto;
	
	public Producto() {
		super();
		this.activo = true;
	}
	

	public GeneroRopa getGeneroRopa() {
		return generoRopa;
	}

	public void setGeneroRopa(GeneroRopa generoRopa) {
		this.generoRopa = generoRopa;
	}

	public CategoriaProducto getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public int getTiempoFabricacion() {
		return tiempoFabricacion;
	}
	public void setTiempoFabricacion(int tiempoFabricacion) {
		this.tiempoFabricacion = tiempoFabricacion;
	}
	
	public boolean getActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public AreaPersonalizacion getPosiblesPersonalizaciones() {
		return posiblesPersonalizaciones;
	}

	public void setPosiblesPersonalizaciones(AreaPersonalizacion posiblesPersonalizaciones) {
		this.posiblesPersonalizaciones = posiblesPersonalizaciones;
	}
	
	
	

}
