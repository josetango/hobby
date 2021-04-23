package com.yosef.tiquetesvuelo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yosef.tiquetesvuelo.models.TiquetesVuelo;
import com.yosef.tiquetesvuelo.services.TiquetesVueloService;

@RestController(value = "")
public class TiquetesVueloController {

	@Autowired
	private TiquetesVueloService tiquetesVueloService;
	
	public TiquetesVueloController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping
	public ResponseEntity<List<TiquetesVuelo>> get() {
		try {
			return ResponseEntity.ok(this.tiquetesVueloService.get());
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping("{id}")
	public ResponseEntity<TiquetesVuelo> get(@PathVariable("id") Long id) {
		try {
			return this.tiquetesVueloService.get(id).map(tiquetesVuelo -> ResponseEntity.ok(tiquetesVuelo))
					.orElseGet(() -> ResponseEntity.notFound().build());
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PostMapping()
	public ResponseEntity<TiquetesVuelo> create(@RequestBody TiquetesVuelo tiquetesVuelo) {
		try {
			TiquetesVuelo result = this.tiquetesVueloService.create(tiquetesVuelo);
			return ResponseEntity.created(URI.create("/" + tiquetesVuelo.getId())).body(result);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("{id}")
	public ResponseEntity delete(@PathVariable("id") Long id) {
		try {
			this.tiquetesVueloService.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
