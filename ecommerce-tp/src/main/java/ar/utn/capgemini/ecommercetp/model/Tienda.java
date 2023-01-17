package ar.utn.capgemini.ecommercetp.model;


import ar.utn.capgemini.ecommercetp.model.carrito.Carrito;
import ar.utn.capgemini.ecommercetp.model.vendedor.Vendedor;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tienda")
public class Tienda  extends EntidadPersistente {
        @OneToOne
        @JoinColumn(name = "vendedor_id", referencedColumnName = "id")
		private Vendedor vendedor;
        
        @OneToOne
        @JoinColumn(name = "carrito_id", referencedColumnName = "id")
        private Carrito carrito;
}
