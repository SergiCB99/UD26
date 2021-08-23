package Ejercicio1.service;

import java.util.List;

import Ejercicio1.dto.Articulo;
import Ejercicio1.dto.Fabricante;

public interface IArticuloService {

	public List<Articulo> listarArticulo(); //Listar All 
	
	public Articulo guardarArticulo(Articulo articulo);	//Guarda un articulo CREATE
	
	public Articulo actualizarArticulo(Articulo articulo); //Actualiza datos del articulo UPDATE
	
	public void eliminarArticulo(Long id);// Elimina el articulo DELETE
	
	public Articulo articuloXID(Long id); //Leer datos de un articulo READ
	
	public List<Articulo> listarArticulosNombre(String nombre); //Listar por nombre
	
	public List<Articulo> listarArticulosPrecio(int precio); //Listar por precio
	
	public List<Articulo> listarArticulosFabricante(Fabricante fabricante_final); //Listar por precio
	
}
