package com.combo.videojuegos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "videojuego")
public class Videojuego {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre, descripcion, url;
	
	public Videojuego() {
		// TODO Auto-generated constructor stub
	}
	
	public Videojuego(String nombre, String descripcion, String url, Distribuidor distribuidor) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.url = url;
		this.distribuidor = distribuidor;
	}

	@ManyToOne
	private Distribuidor distribuidor;

	public Distribuidor getDistribuidor() {
		return distribuidor;
	}

	public void setDistribuidor(Distribuidor dist) {
		this.distribuidor = dist;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getUrl() {
		return url;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", url=" + url
				+ ", distribuidor=" + distribuidor + "]";
	}
	
	
}
