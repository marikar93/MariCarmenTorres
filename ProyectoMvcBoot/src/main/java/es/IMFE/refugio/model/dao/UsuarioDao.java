package es.IMFE.refugio.model.dao;

import es.IMFE.refugio.model.Usuario;

public interface UsuarioDao {
	
	/**
	 * Metodo para registrar un usuario
	 * @param usuario El usuario que se guarda
	 * @throws DaoException error de bdd
	 */
	public void save(Usuario usuario) throws DaoException;
	
	
	/**
	 * Metodo para modificar los datos de un usuario
	 * @param usuario El usuario que modificamos
	 * @throws DaoException error de bdd
	 */
	public void update(Usuario usuario) throws DaoException;
	
	
	/**
	 * Metodo para eliminar un usuario
	 * @param usuario
	 * @throws DaoException error de bdd
	 */
	public void delete(Usuario usuario) throws DaoException;
	
	/**
	 * Metodo para buscar un usuario por su id
	 * @param id Id del usuario que queremos buscar
	 * @return Devuelve un usuario
	 * @throws DaoException error de bdd
	 */
	public Usuario findById(int id) throws DaoException;
	
	/**
	 * Metodo para buscar un usuario por dni
	 * @param dni Dni del usuario que queremos buscar
	 * @return Devuelve un usuario
	 * @throws DaoException error de bdd
	 */
	public Usuario findByDni(String dni) throws DaoException;
	
	/**
	 * Metodo para encontrar un usuario	por usuario y contrase�a
	 * @param user nick del usuario
	 * @param pass pasword del usuario
	 * @return Devuelve el usuario con el correspondiente nick y pass
	 * @throws DaoException error de bdd
	 */
	public Usuario findByUserAndPass(String user, String pass) throws DaoException;

}
