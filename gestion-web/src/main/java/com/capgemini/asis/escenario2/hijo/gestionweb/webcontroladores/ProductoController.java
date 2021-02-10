package com.capgemini.asis.escenario2.hijo.gestionweb.webcontroladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.asis.escenario2.hijo.gestionmodel.servicios.ProductoService;

@Controller
public class ProductoController {

	@Autowired
	private ProductoService service;

	@GetMapping("verproductos/{idcategoria}")
	public ModelAndView getProductosConIdCategoria(@PathVariable("id") int idcat) {
		return new ModelAndView("productos", "lista_productos_by_categoria",
				service.getAllProductosByIdCategoria(idcat));
	}

}
