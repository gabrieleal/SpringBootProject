package com.combo.videojuegos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.combo.videojuegos.domain.Videojuego;
import com.combo.videojuegos.service.VideojuegoService;

@Controller
public class ListadoController {

	private final VideojuegoService serv;

	public ListadoController(VideojuegoService v) {
		// TODO Auto-generated constructor stub
		this.serv = v;
	}

	@RequestMapping("/") // atiende las peticiones que vengan a la raiz
	public String index(Model m) {
		List<Videojuego> lista = this.serv.buscarDestacados();
		m.addAttribute("lista", lista);
		return "listado";
	}

	@RequestMapping("/videojuegosPorDistribuidor")
	public String videojuuegospordistribuidor(@RequestParam("id") int iddistribuidor, Model m) {
		try {
			List<Videojuego> lista = this.serv.Buscar_por_Distribuidores(iddistribuidor);
			m.addAttribute("lista", lista);
			return "listado";
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			m.addAttribute("error", e.getMessage());
			return "listado";
		}

	}
	
	@RequestMapping("/buscador")
	public String buscador(@RequestParam("q") String busqueda, Model m) {
		try {
			List<Videojuego> lista = this.serv.Buscar(busqueda);
			m.addAttribute("lista", lista);
			if(lista.size()==0) {
				String mensaje = "Ningún elemento coincide con su búsqueda";
				m.addAttribute("error", mensaje);
			}
			return "listado";
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			m.addAttribute("error", e.getMessage());
			return "listado";
		}

	}
	
	

}
