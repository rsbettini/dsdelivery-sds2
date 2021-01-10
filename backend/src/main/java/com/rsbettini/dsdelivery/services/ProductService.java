package com.rsbettini.dsdelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsbettini.dsdelivery.dto.ProductDTO;
import com.rsbettini.dsdelivery.entities.Product;
import com.rsbettini.dsdelivery.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional (readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
}
