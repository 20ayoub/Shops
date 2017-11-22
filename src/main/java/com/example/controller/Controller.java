package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Shop;
import com.example.mongoRepository.ShopsRepository;

@RestController
public class Controller {	

	    @Autowired
	    ShopsRepository mongod;

		@RequestMapping(value = "/users")
	    public List<Shop> getAllUsers() {
	        return mongod.findAll();
	    }
	}  
	
