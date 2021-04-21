package com.combo.videojuegos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.combo.videojuegos.domain.Videojuego;
import com.combo.videojuegos.repository.VideojuegoRepository;

@Service
public class VideojuegoService {

	@Autowired
	private VideojuegoRepository repo;

	public List<Videojuego> buscarDestacados() {
		return repo.findAll();
	}

}
