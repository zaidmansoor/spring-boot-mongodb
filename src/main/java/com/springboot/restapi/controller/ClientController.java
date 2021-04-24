package com.springboot.restapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.model.Client;
import com.springboot.restapi.service.ClientService;
import com.springboot.restapi.service.KafkaProducer;

@RestController
@RequestMapping("/api/v1")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@Autowired
	private KafkaProducer producer;
	
	@GetMapping("/clients")
	public List<Client> getAllEmployees() {
		return clientService.getAllClients();
	}
	
	@PostMapping("/clients")
	public Client createEmployee(@Valid @RequestBody Client client) {
		Client clientObject = clientService.createClient(client);
		producer.sendMessage(clientObject.toString());
		
		return clientObject;
	}
	
	@GetMapping("/clients/{id}")
	public ResponseEntity<Client> getEmployeeById(@PathVariable(value = "id") String clientId) 
			throws Exception {
		
		Client client = clientService.getById(clientId);
		return ResponseEntity.ok().body(client);
	}
	
}
