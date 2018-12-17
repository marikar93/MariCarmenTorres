package es.IMFE.refugio.service;

import java.util.List;

import es.IMFE.refugio.model.TipoUsuario;


public interface TipoUsuarioSvc {
	
	/**
	 * Metodo para listar los tipos de usuario
	 * @throws SvcException
	 * @return Devuelve una lista con los tipos de usuario
	 */
	public List<TipoUsuario> listar() throws SvcException;

}
