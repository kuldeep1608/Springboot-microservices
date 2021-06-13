/**
 * 
 */
package com.example.demo.service;

import java.util.LinkedList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepository;
import com.example.demo.entity.ProductEntity;
import com.example.demo.model.Product;

/**
 * @author Kuldeep Singh Yadav
 *
 */
@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<Product> getAll(){
		List<Product> productsList = new LinkedList<>();
		for(ProductEntity entity : productRepo.findAll()) {
			productsList.add(modelMapper.map(entity, Product.class));
		}
		return productsList;
	}
}
