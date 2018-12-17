package es.IMFE.refugio.model.dao;

import java.util.List;

import es.IMFE.refugio.model.TipoUsuario;

public interface TipoUsuarioDao {

	/**
	 * Metodo para listar los tipos de usuario
	 * @throws DaoException error de bdd
	 * @return Devuelve una lista con los tipos de usuario
	 */
	public List<TipoUsuario> findAll() throws DaoException;
}
