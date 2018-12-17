package es.IMFE.refugio.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


/**
 * Clase para crear un animal
 * 
 * @author Mari
 *
 */
@Entity
@Table(name = "animales")
public class Animal {

	// Atributos

	private Integer idanimales;
	private String nombre;
	private String edad;
	private Boolean castrado;
	private Color color;
	private Raza raza;
	private TipoAnimal tipo;
	private Sexo sexo;
	private Date fechaAdopcion;
	private Usuario usuario;

	// Getters and Setters

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdanimales() {
		return idanimales;
	}

	public void setIdanimales(Integer idanimales) {
		this.idanimales = idanimales;
	}

	@NotEmpty
	@Length(max=45)
	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@NotEmpty
	@Column(name = "edad", nullable = false)
	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@NotNull
	@Column(name = "castrado", nullable = false)
	public Boolean getCastrado() {
		return castrado;
	}

	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}

	// Relacion many to one
	@NotNull
	@ManyToOne
	@JoinColumn(name = "idcolor", nullable = false)
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Relacion many to one
	@ManyToOne
	@JoinColumn(name = "idraza")
	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	// Relacion many to one
	@NotNull
	@ManyToOne
	@JoinColumn(name = "idtipo", nullable = false)
	public TipoAnimal getTipo() {
		return tipo;
	}

	public void setTipo(TipoAnimal tipo) {
		this.tipo = tipo;
	}

	// Relacion many to one
	@NotNull
	@ManyToOne
	@JoinColumn(name = "idsexo", nullable = false)
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Temporal(TemporalType.DATE)
	public Date getFechaAdopcion() {
		return fechaAdopcion;
	}

	public void setFechaAdopcion(Date fechaAdopcion) {
		this.fechaAdopcion = fechaAdopcion;
	}

	// Relacion many to one
	@ManyToOne
	@JoinColumn(name = "idusuario")
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
