package es.IMFE.refugio.model.dao;

import java.util.List;

import es.IMFE.refugio.model.TipoAnimal;


public interface TipoAnimalDao {
	
	/**
	 * Metodo para listar los tipos de animales
	 * @throws DaoException error de bdd
	 * @return Devuelve una lista con los tipos de animales
	 */
	public List<TipoAnimal> findAll() throws DaoException;
	
	

}
