package es.IMFE.refugio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import es.IMFE.refugio.service.AnimalSvc;

/**
 * Controlador para eliminar un animal de la base de datos
 * @author usuario
 *
 */
@Controller
public class Eliminar {

	public static final String SUCCESS = "forward:/listarNoAdopt";
	public static final String ERROR = "error";
	
	@Autowired
	private AnimalSvc svc;
	
	@RequestMapping(value = "/eliminar", method=RequestMethod.GET)
	public String execute(@RequestParam int id, Model model){
    	try {
			svc.borrar(svc.buscarPorId(id));
			
			return SUCCESS;	
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
    }
}
