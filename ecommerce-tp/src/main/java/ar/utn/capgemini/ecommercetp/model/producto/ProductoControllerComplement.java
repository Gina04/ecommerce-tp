package ar.utn.capgemini.ecommercetp.model.producto;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController()
public class ProductoControllerComplement {
	
	@DeleteMapping("/productos/{productoId}")
	public @ResponseBody String darDeBajaProducto(@PathVariable("productoId") Integer Producto) {
		return "no paso nada";
	};
}
