package es.IMFE.refugio.service;

import java.util.List;

import es.IMFE.refugio.model.Animal;
import es.IMFE.refugio.model.TipoAnimal;


public interface AnimalSvc {
	
	/**
	 * Metodo para guardar un animal
	 * @param animal El animal que se guarda
	 * @throws SvcException
	 */
	public void guardar(Animal animal) throws SvcException;
	
	
	/**
	 * Metodo para modificar los datos de un animal
	 * @param animal El animal que modificamos
	 * @throws SvcException
	 */
	public void modificar(Animal animal) throws SvcException;
	
	
	/**
	 * Metodo para eliminar un animal
	 * @param animal
	 * @throws SvcException
	 */
	public void borrar(Animal animal) throws SvcException;
	
	
	/**
	 * Metodo para listar animales	
	 * @return Devuelve una lista con todos los animales
	 * @throws SvcException	
	 */
	public List<Animal> listar() throws SvcException;
	
	/**
	 * Metodo para listar animales no adoptados	
	 * @return Devuelve una lista con todos los animales que est�n en adopci�n
	 * @throws SvcException	
	 */
	public List<Animal> listarSinAdop() throws SvcException;
	
	/**
	 * Metodo para listar animales adoptados	
	 * @return Devuelve una lista con todos los animales que est�n en adopci�n
	 * @throws SvcException	
	 */
	public List<Animal> listarAdop() throws SvcException;
	
	
	/**
	 * Metodo que permite buscar un animal por tipo
	 * @param tipo El tipo de animal(perro, gato)
	 * @return Devuelve una lista de animales con ese tipo
	 * @throws SvcException
	 */
	public List<Animal> buscarPorTipo(TipoAnimal tipo) throws SvcException;
	
	/**
	 * Metodo para buscar un animal por su id
	 * @param id Id del producto que queremos buscar
	 * @return Devuelve un animal
	 * @throws SvcException
	 */
	public Animal buscarPorId(int id) throws SvcException;

}
