package com.idat.pe.ef.OscarMunoz.service;

import java.util.List;

import com.idat.pe.ef.OscarMunoz.dto.TuristaDTO;


public interface TuristaService {
	
	List<TuristaDTO> listar();
	void guardar(TuristaDTO turista);

}
