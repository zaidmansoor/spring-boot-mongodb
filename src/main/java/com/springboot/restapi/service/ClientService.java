package com.springboot.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restapi.model.Client;
import com.springboot.restapi.repository.ClientRepository;
import java.util.List;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public Client createClient(Client client) {
		return clientRepository.save(client);
	}
	
	public Client getById(String id) throws Exception {
		Client client = clientRepository.findById(id)
			.orElseThrow(() -> new Error("Person not found: " + id));
		
		return client;
	}
	
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}
	
	public Client getByFirstName(String firstName) {
		return clientRepository.findByFirstName(firstName);
	}
	
}
