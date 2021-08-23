package Ejercicio1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Ejercicio1.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Long>{

	public List<Fabricante> findByNombre(String nombre); //Listar por nombre
	
}
