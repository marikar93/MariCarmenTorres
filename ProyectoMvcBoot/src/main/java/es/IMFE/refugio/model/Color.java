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
 * Clase para crear un color
 * 
 * @author Mari
 *
 */
@Entity
@Table(name = "color")
public class Color {

	// Atributos

	private Integer idcolor;
	private String color;

	// Getters and Setters

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdcolor() {
		return idcolor;
	}

	public void setIdcolor(Integer idcolor) {
		this.idcolor = idcolor;
	}

	@NotNull
	@Length(max=45)
	@Column(name = "color", nullable = false, length = 45)
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
