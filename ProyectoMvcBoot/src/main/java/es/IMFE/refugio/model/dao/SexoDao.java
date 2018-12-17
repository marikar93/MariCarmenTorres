package es.IMFE.refugio.model.dao;

import java.util.List;

import es.IMFE.refugio.model.Sexo;


public interface SexoDao {
	
	/**
	 * Metodo para listar sexo de animales
	 * @throws DaoException error de bdd
	 * @return Devuelve una lista de sexo de animal
	 */
	public List<Sexo> findAll() throws DaoException;

}
