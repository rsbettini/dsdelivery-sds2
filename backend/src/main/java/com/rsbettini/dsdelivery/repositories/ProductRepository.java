package com.rsbettini.dsdelivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsbettini.dsdelivery.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

	List<Product> findAllByOrderByNameAsc();
}
