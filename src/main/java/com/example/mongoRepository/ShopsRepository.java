package com.example.mongoRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Shop;

public interface ShopsRepository extends MongoRepository<Shop , String> {
	
}
