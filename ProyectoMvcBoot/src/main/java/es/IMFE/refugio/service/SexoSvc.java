package es.IMFE.refugio.service;

import java.util.List;

import es.IMFE.refugio.model.Sexo;

public interface SexoSvc {
	
	/**
	 * Metodo para listar sexo de animales
	 * @throws SvcException
	 * @return Devuelve una lista de sexo de animal
	 */
	public List<Sexo> listar() throws SvcException;

}
