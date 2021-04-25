package com.combo.videojuegos.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.combo.videojuegos.domain.Distribuidor;
import com.combo.videojuegos.domain.Videojuego;
import com.combo.videojuegos.service.DistribuidorService;
import com.combo.videojuegos.service.VideojuegoService;

@Controller
@RequestMapping("/abm")
public class VideojuegoAbmController {
	
	@Autowired
	private DistribuidorService dist;
	@Autowired
	private VideojuegoService vide;
	
	@RequestMapping("/create")
	public String create(Model m) {
		List<Distribuidor> list=dist.listar();
		m.addAttribute("dist",list);
		m.addAttribute("videojuego",new Videojuego());
		return "FormCreate";
	}
	
	@PostMapping("/save")
	public String save(Videojuego video) {
 		System.out.println(video);
 		vide.save(video);
		return "redirect:/";
	}
	
}
