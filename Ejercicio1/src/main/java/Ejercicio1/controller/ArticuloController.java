package Ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio1.dto.Articulo;
import Ejercicio1.dto.Fabricante;
import Ejercicio1.service.ArticuloServiceImpl;
import Ejercicio1.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	//Para listar por fabricante
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulo(){
		return articuloServiceImpl.listarArticulo();
	}
	
	//Insert
	@PostMapping("/articulos")
	public Articulo salvarArticulo(@RequestBody Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	//Actualizar
	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulo(@PathVariable(name="id")Long id,@RequestBody Articulo articulo) {
			
		Articulo articulo_seleccionado= new Articulo();
		Articulo articulo_actualizado= new Articulo();
			
		articulo_seleccionado = articuloServiceImpl.articuloXID(id);
			
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());	
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		
		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulo_actualizado);
			
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulo(@PathVariable(name="id")Long id) {
		articuloServiceImpl.eliminarArticulo(id);
	}
	
	@GetMapping("/articulos/nombre/{nombre}")
	public List<Articulo> listarArticulosNombres(@PathVariable(name="nombre")String nombre){
		return articuloServiceImpl.listarArticulosNombre(nombre);
	}
	
	@GetMapping("/articulos/precio/{precio}")
	public List<Articulo> listarArticulosPrecio(@PathVariable(name="precio")int precio){
		return articuloServiceImpl.listarArticulosPrecio(precio);
	}
	
	@GetMapping("/articulos/fabricante/{fabricante}")
	public List<Articulo> listarArticulosFabricante(@PathVariable(name="fabricante")Long fabricante){
		Fabricante fabricante_final= new Fabricante();
		fabricante_final = fabricanteServiceImpl.fabricanteXID(fabricante);
		return articuloServiceImpl.listarArticulosFabricante(fabricante_final);
	}
	
}
