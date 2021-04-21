package com.combo.videojuegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.combo.videojuegos.domain.Videojuego;

public interface VideojuegoRepository extends JpaRepository<Videojuego,Integer> {

	 
}
