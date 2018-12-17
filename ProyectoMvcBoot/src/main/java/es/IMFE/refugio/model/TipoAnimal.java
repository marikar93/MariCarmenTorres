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
 * Clase para crear un tipo de animal
 * @author usuario
 *
 */
@Entity
@Table(name="tipoanimal")
public class TipoAnimal {
	
	//Atributos
	
	private Integer idtipo;
	private String tipo;

	//Getters and Setters
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(Integer idtipo) {
		this.idtipo = idtipo;
	}
	
	@NotNull
	@Length(max=45)
	@Column(name = "tipo", nullable = false, length = 45)
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}