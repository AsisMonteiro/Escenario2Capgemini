package com.capgemini.asis.escenario2.hijo.gestionmodel.servicios;

import java.util.List;

import com.capgemini.asis.escenario2.hijo.gestionmodel.entidades.Producto;

/*
 * Servicio para entidad Producto
 */
public interface ProductoService {

	List<Producto> getAllProductosByIdCategoria(int idcategoria);
}
