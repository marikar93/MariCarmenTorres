package es.IMFE.refugio.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


/**
 * Clase para crear un usuario
 * @author Mari
 *
 */
@Entity
@Table(name="usuario")
public class Usuario {
	
	//Atributos
	
	private Integer idusuario;
	private String user;	
	private String pass;
	private String dni;
	private String nombre;
	private String correo;
	private Integer telefono;
	private String direccion;
	private Integer numsocio;
	private TipoUsuario tipoUsuario;
	
	//Atributo para one to many
	
	private Set<Animal> adoptados;

	
	//Getters and Setters

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	
	@NotEmpty
	@Length(max=45)
	@Column(name = "user", nullable = false, length = 45)
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@NotEmpty
	@Length(max=45)
	@Column(name = "pass", nullable = false, length = 45)
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@NotEmpty
	@Length(max=9)
	@Column(name = "dni", nullable = false, length = 9)
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@NotEmpty
	@Length(max=255)
	@Column(name = "nombre", nullable = false, length = 255)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Length(max=45)
	@Column(name = "correo", length = 45)
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@NotNull
	@Column(name = "telefono", nullable = false)
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	@NotEmpty
	@Length(max=255)
	@Column(name = "direccion", nullable = false, length = 255)
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Column(name = "numsocio")
	public Integer getNumsocio() {
		return numsocio;
	}
	public void setNumsocio(Integer numsocio) {
		this.numsocio = numsocio;
	}
	
	//Relacion many to one 
	@NotNull
	@ManyToOne
    @JoinColumn(name="idtipo", nullable=false)
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	//Relacion one to many
	@OneToMany(fetch=FetchType.EAGER, mappedBy="usuario")
	public Set<Animal> getAdoptados() {
		return adoptados;
	}
	public void setAdoptados(Set<Animal> adoptados) {
		this.adoptados = adoptados;
	}

}


