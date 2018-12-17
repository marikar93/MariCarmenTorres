package es.IMFE.refugio.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import es.IMFE.refugio.model.Animal;
import es.IMFE.refugio.service.AnimalSvc;
import es.IMFE.refugio.service.ColorSvc;
import es.IMFE.refugio.service.RazaSvc;
import es.IMFE.refugio.service.SexoSvc;
import es.IMFE.refugio.service.TipoAnimalSvc;

/**
 * Controlador para modificar y guardar un animal en la base de datos
 * @author Mari
 *
 */
@Controller
public class Guardar {
	

	private static final String SUCCESS = "form";
	private static final String ERROR = "error";
	
	@Autowired
	private AnimalSvc svc;
	
	@Autowired
	private ColorSvc csvc;
	
	@Autowired
	private RazaSvc rsvc;
	
	@Autowired
	private SexoSvc ssvc;
	
	@Autowired
	private TipoAnimalSvc tsvc;
	
	
	@Autowired
	private MessageSource messages;
	
			
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		//Se encarga de parsear las fechas correctamente cuando vienen de formulario
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	//Guardar la lista para el select y pasar al form
	@RequestMapping(value = "/guardar", method=RequestMethod.GET)
    public String view(@RequestParam int id, Model model) {
		try {
			
			model.addAttribute("animal", svc.buscarPorId(id));
			
			//Incluir elementos para la seleccion del color
			model.addAttribute("listaColor", csvc.listar());
			
			//Incluir elementos para la seleccion de la raza
			model.addAttribute("listaRaza", rsvc.listar());
			
			//Incluir elementos para la seleccion del sexo
			model.addAttribute("listaSexo", ssvc.listar());
			
			//Incluir elementos para la seleccion del tipo
			model.addAttribute("listaTipoAnimal", tsvc.listar());
			
			return SUCCESS;
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
	}
	
	@RequestMapping(value = "/buscar", method=RequestMethod.GET)
    public String view(@ModelAttribute Animal animal, Model model) {
		try {
			
			//Incluir elementos para la seleccion del color
			model.addAttribute("listaColor", csvc.listar());
			
			//Incluir elementos para la seleccion de la raza
			model.addAttribute("listaRaza", rsvc.listar());
			
			//Incluir elementos para la seleccion del sexo
			model.addAttribute("listaSexo", ssvc.listar());
			
			//Incluir elementos para la seleccion del tipo
			model.addAttribute("listaTipoAnimal", tsvc.listar());
			
			return SUCCESS;
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
	}

	//guardar: registrar el animal, tambien se vuelve a cargar la lista para el select ya que se vuelve al formulario
    @RequestMapping(value= "/guardar", method=RequestMethod.POST)
    public String execute(@Valid Animal animal, BindingResult result, Model model, Locale locale) {
		try {
			
			//Comprobar si hay errores de entrada
			if (result.hasErrors()){
				
				return view(animal, model);
				
			}else {
				//Incluir elementos para la seleccion del color del nuevo animal
				model.addAttribute("listaColor", csvc.listar());
				
				//Incluir elementos para la seleccion de la raza del nuevo animal
				model.addAttribute("listaRaza", rsvc.listar());
				
				//Incluir elementos para la seleccion del sexo del nuevo animal
				model.addAttribute("listaSexo", ssvc.listar());
				
				//Incluir elementos para la seleccion del tipo del nuevo animal
				model.addAttribute("listaTipoAnimal", tsvc.listar());
				
				if (animal.getIdanimales() == null){
					svc.guardar(animal);
				}else{
					svc.modificar(animal);
				}
				
				model.addAttribute("msg", messages.getMessage("mensaje.exito", null, locale));
				
				//Limpiar formulario
				model.addAttribute("animal", new Animal());
				
				return SUCCESS;
			
			}	
			
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
    }
    
}
