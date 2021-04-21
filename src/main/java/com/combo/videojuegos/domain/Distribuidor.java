package com.combo.videojuegos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Distribuidor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nombre, web;
	public Integer getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getWeb() {
		return web;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	
}
