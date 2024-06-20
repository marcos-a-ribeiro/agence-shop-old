package com.agence.shop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agence.shop.entities.Category;
import com.agence.shop.repositories.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo repo;
	
//	public CategoryService(CategoryRepo repo) {
//		this.repo = repo;
//	}
	
	public List<Category> findAll() {
		return repo.findAll();
	}

}
