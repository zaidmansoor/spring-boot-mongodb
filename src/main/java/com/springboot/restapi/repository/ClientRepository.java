package com.springboot.restapi.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.restapi.model.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
	public Client findByFirstName(String firstName);
}
