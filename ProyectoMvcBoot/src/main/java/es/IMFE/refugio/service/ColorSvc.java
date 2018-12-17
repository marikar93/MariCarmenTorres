package es.IMFE.refugio.service;

import java.util.List;

import es.IMFE.refugio.model.Color;


public interface ColorSvc {

	/**
	 * Metodo para listar colores
	 * @throws SvcException 
	 * @return Devuelve una lista de colores
	 */
	public List<Color> listar() throws SvcException;
}
