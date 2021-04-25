package com.combo.videojuegos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.combo.videojuegos.domain.Videojuego;


public interface VideojuegoRepository extends JpaRepository<Videojuego,Integer> {
	
	 @Query("select v from Videojuego v order by v.nombre desc")
	 List<Videojuego> buscarTodos();
	 /*
	 @Query(value = "select * from Videojuego v order by v.nombre desc", nativeQuery = true)
	 List<Videojuego> buscarTodos();
	 */
	 
	 @Query("from Videojuego v where v.distribuidor.id=?1 order by v.nombre asc")
	 List<Videojuego> BuscarporProveedor(int iddistribuidor);
	 
	 @Query("from Videojuego v where v.nombre LIKE %?1%")
	 List<Videojuego> buscar(String nombre);
	 
	 List<Videojuego> findByNombreContaining(String nombre);

}
