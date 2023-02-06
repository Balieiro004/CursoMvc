package com.balieiro.cursomvc.cursomvc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.balieiro.cursomvc.cursomvc.entities.Categoria;
import com.balieiro.cursomvc.cursomvc.services.CategoriaService;

@RestController
@RequestMapping(value = "categoria")
public class CategoriaResources {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Categoria obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
