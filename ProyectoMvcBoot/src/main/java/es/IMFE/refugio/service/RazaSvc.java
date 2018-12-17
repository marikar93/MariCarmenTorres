package es.IMFE.refugio.service;

import java.util.List;

import es.IMFE.refugio.model.Raza;


public interface RazaSvc {
	
	/**
	 * Metodo para listar razas
	 * @throws SvcException
	 * @return Devuelve una lista de razas de animales
	 */
	public List<Raza> listar() throws SvcException;

}
