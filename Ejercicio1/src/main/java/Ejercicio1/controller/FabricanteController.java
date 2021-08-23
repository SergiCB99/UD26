package Ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Ejercicio1.dto.Fabricante;
import Ejercicio1.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;

	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricante();
	}
	
	//Insert
	@PostMapping("/fabricantes")
	public Fabricante salvarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	//Actualizar
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id")Long id,@RequestBody Fabricante fabricante) {
			
		Fabricante fabricante_seleccionado= new Fabricante();
		Fabricante fabricante_actualizado= new Fabricante();
			
		fabricante_seleccionado = fabricanteServiceImpl.fabricanteXID(id);
			
		fabricante_seleccionado.setNombre(fabricante.getNombre());
			
			
		fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ fabricante_actualizado);
			
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eliminarFabricante(@PathVariable(name="id")Long id) {
		fabricanteServiceImpl.eliminarFabricante(id);
	}
	
	@GetMapping("/fabricantes/nombre/{nombre}")
	public List<Fabricante> listarFabricantesNombres(@PathVariable(name="nombre")String nombre){
		return fabricanteServiceImpl.listarFabricantesNombre(nombre);
	}
	
}
