package com.capgemini.asis.escenario2.hijo.gestionmodel.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.asis.escenario2.hijo.gestionmodel.entidades.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

	@Query("SELECT * FROM producto AS prod WHERE prod.idcategoria = :value")
	List<Producto> findAllProductosByIdCategoria(@Param("value") int idcategoria);

}
