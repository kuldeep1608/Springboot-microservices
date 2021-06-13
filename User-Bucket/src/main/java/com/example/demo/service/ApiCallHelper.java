/**
 * 
 */
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Product;

/**
 * @author Kuldeep Singh Yadav
 *
 */
@Component
public class ApiCallHelper {

	@Autowired
	private RestTemplate restTemplate;
	
	public List<Product> getProductDetails(){
		ResponseEntity<List<Product>> products = restTemplate.exchange("http://User-Products/product", HttpMethod.GET, HttpEntity.EMPTY, new ParameterizedTypeReference<List<Product>>() {});
		System.out.println(products);
		return products.getBody();
	}
	
}
