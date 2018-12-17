package es.IMFE.refugio.model.dao;

import java.util.List;

import es.IMFE.refugio.model.Color;


public interface ColorDao {
	
	/**
	 * Metodo para listar colores
	 * @throws DaoException error de bdd
	 * @return Devuelve una lista de colores
	 */
	public List<Color> findAll() throws DaoException;

}
