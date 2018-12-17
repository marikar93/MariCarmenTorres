package es.IMFE.refugio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import es.IMFE.refugio.model.Usuario;
import es.IMFE.refugio.service.UsuarioSvc;

/**
 * Nos permite mandar los datos de un usuario a una jsp para listarlos
 * @author usuario
 *
 */
@Controller
public class DatosUsuario {
	
	private static final String SUCCESS = "datosUsuario";
	private static final String ERROR = "error";
	
	@Autowired
	private UsuarioSvc svc;
	
	@RequestMapping(value = "/datosUsuario", method=RequestMethod.GET)
    public String view(@RequestParam String dni, Model model) {
		try {
			
			Usuario usuario = svc.buscarPorDni(dni);
			model.addAttribute("usuario", usuario);
			
			return SUCCESS;
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
	}

}
