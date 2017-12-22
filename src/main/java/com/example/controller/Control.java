package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Point;
import com.example.model.Shop;


@Controller
@RequestMapping(value="/api")
public class Control {

	private Map<Integer, Shop> shops = new HashMap<Integer, Shop>(){

		{
	        put(1, new Shop("1", "Mary", "Taylor", "24","hhhh",new Point(1.0,2.0))); 
	        }
	};
	
	@GetMapping(value="/customer",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Shop> getAll(){
		List<Shop> results = shops.entrySet().stream()
									.map(entry ->entry.getValue())
									.collect(Collectors.toList());
		return results;
	}
}