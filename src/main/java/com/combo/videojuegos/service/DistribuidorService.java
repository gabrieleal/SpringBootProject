package com.combo.videojuegos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.combo.videojuegos.domain.Distribuidor;
import com.combo.videojuegos.repository.DistribuidorRepository;


@Service
public class DistribuidorService {
	
	@Autowired
	DistribuidorRepository repo;
	
	public java.util.List<Distribuidor> listar(){
		return repo.findAll();
	}
	
	
}
