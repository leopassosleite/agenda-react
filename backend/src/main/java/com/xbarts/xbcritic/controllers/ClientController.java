package com.xbarts.xbcritic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xbarts.xbcritic.entities.Client;
import com.xbarts.xbcritic.repositories.ClientRepository;


@CrossOrigin("origins = http://localhost:3000")
@RestController
@RequestMapping(value = "/clients")
public class ClientController {

	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping
	public List<Client> getAllClients(){
		return clientRepository.findAll();
	}
	
	@PostMapping
	public Client insertClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
}