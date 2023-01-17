package ar.utn.capgemini.ecommercetp.model.carrito;

import ar.utn.capgemini.ecommercetp.model.EntidadPersistente;
//import ar.utn.capgemini.ecommercetp.model.vendedor.ProductoPersonalizado;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item extends EntidadPersistente {
   // @OneToOne
    //@JoinColumn(name = "productoPersonalizado_id", referencedColumnName = "id")
	//private ProductoPersonalizado productoPersonalizado;
}
