package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FarmUserRepository extends MongoRepository<FarmUser,String> {

	
}