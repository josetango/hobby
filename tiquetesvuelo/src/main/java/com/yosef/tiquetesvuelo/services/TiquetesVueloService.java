package com.yosef.tiquetesvuelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yosef.tiquetesvuelo.models.TiquetesVuelo;
import com.yosef.tiquetesvuelo.repositories.TiquetesVueloRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TiquetesVueloService {

	@Autowired
	private TiquetesVueloRepository tiquetesVueloRepository;

	public void TiquetesVuelo() {
	}

	public List<TiquetesVuelo> get() {
		List<TiquetesVuelo> tiquetesVuelos = new ArrayList<TiquetesVuelo>();
		this.tiquetesVueloRepository.findAll().forEach(tiquetesVuelos::add);
		return tiquetesVuelos;
	}

	public Optional<TiquetesVuelo> get(Long id) {
		return this.tiquetesVueloRepository.findById(id);
	}

	public TiquetesVuelo create(TiquetesVuelo tiquetesVuelo) {
		return this.tiquetesVueloRepository.save(tiquetesVuelo);
	}

	public void delete(Long id) {
		this.tiquetesVueloRepository.deleteById(id);
	}
}
