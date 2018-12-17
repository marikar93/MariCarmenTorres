package es.IMFE.refugio.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controlador para cerrar sesion
 * @author Mari
 *
 */
@Controller
public class CerrarSesion {
	
	public static final String SUCCESS = "index";
	public static final String ERROR = "error";
	
	@RequestMapping(value = "/cerrar", method=RequestMethod.GET)
	public String acces(Model model, HttpSession session) {
		try {
			
			//Eliminamos la session, en este caso el usuario
			session.invalidate(); 
			
			return SUCCESS; 
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
	}

}
