package com.agence.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agence.shop.entities.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
