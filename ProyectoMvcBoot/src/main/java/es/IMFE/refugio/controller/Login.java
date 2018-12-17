package es.IMFE.refugio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.IMFE.refugio.model.Usuario;

/**
 * Controlador que envia un usuario al formulario de login
 * @author Mari
 *
 */
@Controller
public class Login {
	
	private static final String SUCCESS = "login";
	private static final String ERROR = "login";
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String acces(@ModelAttribute Usuario usuario, Model model) {
		try {
			return SUCCESS; 
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
	}

}
