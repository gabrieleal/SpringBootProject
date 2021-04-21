package com.combo.videojuegos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.combo.videojuegos.domain.Videojuego;
import com.combo.videojuegos.service.VideojuegoService;

@Controller
public class ListadoController {
	
	private final  VideojuegoService serv;
	
	public ListadoController(VideojuegoService  v) {
		// TODO Auto-generated constructor stub
		this.serv=v;
	}
	
	@RequestMapping("/")// atiende las peticiones que vengan a la raiz
	public String index(Model m) {
		List<Videojuego> lista = this.serv.buscarDestacados();
		m.addAttribute("lista",lista);
		return "listado";
	}
	
}
