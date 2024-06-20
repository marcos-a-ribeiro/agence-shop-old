package com.agence.shop.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agence.shop.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = new ArrayList<>();
		return ResponseEntity.ok().body(list);
	}
	
	
}
