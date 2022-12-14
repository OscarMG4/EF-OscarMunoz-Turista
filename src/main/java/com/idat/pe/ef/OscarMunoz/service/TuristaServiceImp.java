package com.idat.pe.ef.OscarMunoz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.ef.OscarMunoz.dto.TuristaDTO;
import com.idat.pe.ef.OscarMunoz.model.Turista;
import com.idat.pe.ef.OscarMunoz.repository.TuristaRepository;

@Service
public class TuristaServiceImp implements TuristaService {
	
	@Autowired
	private TuristaRepository repo;

	@Override
	public List<TuristaDTO> listar() {
		
		List<TuristaDTO> listadto = new ArrayList<>();
		TuristaDTO dto = null;
				
		for (Turista turista : repo.findAll()) {
			dto = new TuristaDTO();
			dto.setId(turista.getIdTurista());
			dto.setDireccion(turista.getDireccion());
			dto.setNombre(turista.getNombre());
			dto.setNroCel(turista.getNroCel());
			listadto.add(dto);
		}

		return listadto;
	}

	@Override
	public void guardar(TuristaDTO turista) {
		// TODO Auto-generated method stub
		
		Turista turis = new Turista();
		turis.setIdTurista(turista.getId());
		turis.setDireccion(turista.getDireccion());
		turis.setNombre(turista.getNombre());
		turis.setNroCel(turista.getNroCel());
		
		repo.save(turis);
	}
	


}
