package com.capgemini.asis.escenario2.hijo.gestionmodel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.asis.escenario2.hijo.gestionmodel.entidades.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
