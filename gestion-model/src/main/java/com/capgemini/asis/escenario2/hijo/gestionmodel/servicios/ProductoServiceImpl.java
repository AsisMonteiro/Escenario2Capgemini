package com.capgemini.asis.escenario2.hijo.gestionmodel.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.asis.escenario2.hijo.gestionmodel.entidades.Producto;
import com.capgemini.asis.escenario2.hijo.gestionmodel.repositorios.ProductoRepository;

@Service
//@Transactional
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;

	@Override
	public List<Producto> getAllProductosByIdCategoria(int idcategoria) {
		return repository.findAllProductosByIdCategoria(idcategoria);

	}

}
