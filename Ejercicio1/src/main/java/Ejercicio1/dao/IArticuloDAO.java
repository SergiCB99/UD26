package Ejercicio1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Ejercicio1.dto.Articulo;
import Ejercicio1.dto.Fabricante;

public interface IArticuloDAO extends JpaRepository<Articulo, Long> {

	public List<Articulo> findByNombre(String nombre); //Listar por nombre
	
	public List<Articulo> findByPrecio(int precio); //Listar por precio
	
	public List<Articulo> findByFabricante(Fabricante fabricante_final); //Listar por nombre
	
}
