package com.combo.videojuegos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.combo.videojuegos.domain.Videojuego;
import com.combo.videojuegos.repository.VideojuegoRepository;

@Service
public class VideojuegoService {

	@Autowired
	private VideojuegoRepository repo;
	
	public void save(Videojuego video) {
		repo.save(video);
	}
	public List<Videojuego> buscarDestacados() {
		return repo.buscarTodos();
	}
	
	public List<Videojuego> Buscar_por_Distribuidores(int iddistribuidor){
		return repo.BuscarporProveedor(iddistribuidor);
	}
	
	public List<Videojuego> Buscar(String buscar){
		return repo.findByNombreContaining(buscar);
	}

}
