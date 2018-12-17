package es.IMFE.refugio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Clase para crear una raza
 * 
 * @author Mari
 *
 */

@Entity
@Table(name = "raza")
public class Raza {

	// Atributos

	private Integer idraza;
	private String raza;

	// Getters and Setters

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdraza() {
		return idraza;
	}

	public void setIdraza(Integer idraza) {
		this.idraza = idraza;
	}

	@NotNull
	@Length(max=45)
	@Column(name = "raza", nullable = false, length = 45)
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}
