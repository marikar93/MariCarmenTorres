package es.IMFE.refugio.model.dao;

import java.util.List;

import es.IMFE.refugio.model.Raza;


public interface RazaDao {
	
	/**
	 * Metodo para listar razas
	 * @throws DaoException error de bdd
	 * @return Devuelve una lista de razas de animales
	 */
	public List<Raza> findAll() throws DaoException;

}
