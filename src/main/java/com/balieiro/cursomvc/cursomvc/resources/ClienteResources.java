package com.balieiro.cursomvc.cursomvc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.balieiro.cursomvc.cursomvc.entities.Cliente;
import com.balieiro.cursomvc.cursomvc.services.ClienteService;

@RestController
@RequestMapping(value = "clientes")
public class ClienteResources {
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Cliente obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
