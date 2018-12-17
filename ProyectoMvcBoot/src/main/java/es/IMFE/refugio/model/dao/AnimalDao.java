package es.IMFE.refugio.model.dao;

import java.util.List;

import es.IMFE.refugio.model.Animal;
import es.IMFE.refugio.model.TipoAnimal;

public interface AnimalDao {
	
	/**
	 * Metodo para guardar un animal
	 * @param animal El animal que se guarda
	 * @throws DaoException error de bdd
	 */
	public void save(Animal animal) throws DaoException;
	
	
	/**
	 * Metodo para modificar los datos de un animal
	 * @param animal El animal que modificamos
	 * @throws DaoException error de bdd
	 */
	public void update(Animal animal) throws DaoException;
	
	
	/**
	 * Metodo para eliminar un animal
	 * @param animal
	 * @throws DaoException error de bdd
	 */
	public void delete(Animal animal) throws DaoException;
	
	
	/**
	 * Metodo para listar animales	
	 * @return Devuelve una lista con todos los animales
	 * @throws DaoException error de bdd	
	 */
	public List<Animal> findAll() throws DaoException;
	
	/**
	 * Metodo para listar animales no adoptados	
	 * @return Devuelve una lista con todos los animales que est�n en adopci�n
	 * @throws DaoException error de bdd	
	 */
	public List<Animal> findAllWithoutAdop() throws DaoException;
	
	/**
	 * Metodo para listar animales adoptados	
	 * @return Devuelve una lista con todos los animales que est�n en adopci�n
	 * @throws DaoException error de bdd	
	 */
	public List<Animal> findAllWithAdop() throws DaoException;
	

	/**
	 * Metodo que permite buscar un animal por tipo
	 * @param tipo El tipo de animal(perro, gato)
	 * @return Devuelve una lista de animales con ese tipo
	 * @throws DaoException error de bdd
	 */
	public List<Animal> findByTipo(TipoAnimal tipo) throws DaoException;
	
	/**
	 * Metodo para buscar un animal por su id
	 * @param id Id del producto que queremos buscar
	 * @return Devuelve un animal
	 * @throws DaoException error de bdd
	 */
	public Animal findById(int id) throws DaoException;
	
}
