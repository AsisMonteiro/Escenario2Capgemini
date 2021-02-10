package com.capgemini.asis.escenario2.hijo.gestionmodel.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.asis.escenario2.hijo.gestionmodel.entidades.Categoria;
import com.capgemini.asis.escenario2.hijo.gestionmodel.repositorios.CategoriaRepository;

@Service
//@Transactional
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	@Override
	public List<Categoria> getAll() {
		return repository.findAll();
	}
}
