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
 * Clase para generar el sexo de un animal
 * @author Mari
 *
 */
@Entity
@Table(name="sexo")
public class Sexo {
	
	//Atributos
	
	private Integer idsexo;
	private String sexo;

	//Getters and Setters
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdsexo() {
		return idsexo;
	}
	public void setIdsexo(Integer idsexo) {
		this.idsexo = idsexo;
	}
	
	@NotNull
	@Length(max=45)
	@Column(name = "sexo", nullable = false, length = 45)
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}

