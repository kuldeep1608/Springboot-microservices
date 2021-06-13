/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bucket;
import com.example.demo.service.BucketService;

/**
 * @author Kuldeep Singh Yadav
 *
 */
@RestController
@RequestMapping("/bucket")
public class BucketController {

	@Autowired
	private BucketService bucketService;
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Bucket>> getAllByUserID(@PathVariable(value = "userId") String userId){
		List<Bucket> items = bucketService.getAllByUserId(userId);
		return new ResponseEntity<List<Bucket>>(items, HttpStatus.OK);
	}
}
