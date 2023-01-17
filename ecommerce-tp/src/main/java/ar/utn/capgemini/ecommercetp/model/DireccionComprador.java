package ar.utn.capgemini.ecommercetp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable

public class DireccionComprador {
	
	@Column
	private String calle; 
	
	@Column
	private String altura;
	
	@Column
	private String comuna;
	
	@Column
	private String provincia;
	
	@Column
	private String cp;
	
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}

}
