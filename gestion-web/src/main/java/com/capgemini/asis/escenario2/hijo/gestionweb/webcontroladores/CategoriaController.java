package com.capgemini.asis.escenario2.hijo.gestionweb.webcontroladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.asis.escenario2.hijo.gestionmodel.servicios.CategoriaService;

@Controller
public class CategoriaController {

	@Autowired
	private CategoriaService service;

	@GetMapping(path = { "/", "/escenario2" })
	public ModelAndView index() {
		return new ModelAndView("index", "categorias", service.getAll());
	}

}
