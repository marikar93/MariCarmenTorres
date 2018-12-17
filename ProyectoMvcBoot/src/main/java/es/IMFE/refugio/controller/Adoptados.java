package es.IMFE.refugio.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.IMFE.refugio.model.Usuario;
import es.IMFE.refugio.service.UsuarioSvc;

/**
 * Controlador para poder listar animales adoptados por el usuario logueado
 * @author Mari
 *
 */
@Controller
public class Adoptados {
	
	public static final String SUCCESS = "animalPorUsuario";
	public static final String ERROR = "error";
	
	@Autowired
	private UsuarioSvc svc;
	
	@RequestMapping(value = "/adoptados", method=RequestMethod.GET)
	public String execute(Model model, HttpSession session){
    	try {	
    		//Recogemos el usuario de la sesion
    		Usuario usuario = (Usuario) session.getAttribute("sessionUser");
    		
    		//Refrescar
    		usuario = svc.buscarPorId(usuario.getIdusuario());
    		
    		//Mandamos a la jsp la lista de animales adoptados por dicho usuario
    		model.addAttribute("adoptados", usuario.getAdoptados());
    		
			return SUCCESS;
			
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
    }

}
