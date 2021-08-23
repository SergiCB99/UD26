package Ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ejercicio1.dao.IArticuloDAO;
import Ejercicio1.dto.Articulo;
import Ejercicio1.dto.Fabricante;

@Service
public class ArticuloServiceImpl implements IArticuloService{

	@Autowired
	IArticuloDAO iArticuloDAO;

	@Override
	public List<Articulo> listarArticulo() {
		// TODO Auto-generated method stub
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {
		// TODO Auto-generated method stub
		iArticuloDAO.deleteById(id);
	}

	@Override
	public Articulo articuloXID(Long id) {
		// TODO Auto-generated method stub
		return iArticuloDAO.findById(id).get();
	}

	@Override
	public List<Articulo> listarArticulosNombre(String nombre) {
		// TODO Auto-generated method stub
		return iArticuloDAO.findByNombre(nombre);
	}

	@Override
	public List<Articulo> listarArticulosPrecio(int precio) {
		// TODO Auto-generated method stub
		return iArticuloDAO.findByPrecio(precio);
	}

	@Override
	public List<Articulo> listarArticulosFabricante(Fabricante fabricante_final) {
		// TODO Auto-generated method stub
		return iArticuloDAO.findByFabricante(fabricante_final);
	}
	
	
	
}
