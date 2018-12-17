package es.IMFE.refugio.service;

import java.util.List;

import es.IMFE.refugio.model.TipoAnimal;


public interface TipoAnimalSvc {
	
	/**
	 * Metodo para listar los tipos de animales
	 * @throws SvcException
	 * @return Devuelve una lista con los tipos de animales
	 */
	public List<TipoAnimal> listar() throws SvcException;
	

}
