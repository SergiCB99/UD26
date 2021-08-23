package Ejercicio1.service;

import java.util.List;

import Ejercicio1.dto.Fabricante;

public interface IFabricanteService {

	public List<Fabricante> listarFabricante(); //Listar All 
	
	public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un fabricante CREATE
	
	public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del fabricante UPDATE
	
	public void eliminarFabricante(Long id);// Elimina el fabricante DELETE
	
	public Fabricante fabricanteXID(Long id); //Leer datos de un fabricante READ
	
	public List<Fabricante> listarFabricantesNombre(String nombre); //Listar por nombre
	
}
