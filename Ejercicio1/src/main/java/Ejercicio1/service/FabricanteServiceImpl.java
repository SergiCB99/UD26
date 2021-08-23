package Ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ejercicio1.dao.IFabricanteDAO;
import Ejercicio1.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService {

	@Autowired
	IFabricanteDAO iFabricanteDAO;

	@Override
	public List<Fabricante> listarFabricante() {
		// TODO Auto-generated method stub
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long id) {
		// TODO Auto-generated method stub
		iFabricanteDAO.deleteById(id);
	}

	@Override
	public Fabricante fabricanteXID(Long id) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public List<Fabricante> listarFabricantesNombre(String nombre) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.findByNombre(nombre);
	}
	
	
	
}
