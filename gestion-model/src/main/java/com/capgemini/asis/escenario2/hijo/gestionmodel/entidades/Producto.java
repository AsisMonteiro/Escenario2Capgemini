package com.capgemini.asis.escenario2.hijo.gestionmodel.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Entidad Categoria
 * 
 */
@Entity
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	public Producto(int idProducto, String nombre, int idcategoria, Double precio, int unidades) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.idcategoria = idcategoria;
		this.precio = precio;
		this.unidades = unidades;
	}

	public Producto() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "idcategoria")
	private int idcategoria;

	@Column(name = "precio")
	private Double precio;

	@Column(name = "unidades")
	private int unidades;

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

}
