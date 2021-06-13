/**
 * 
 */
package com.example.demo.service;

import java.util.LinkedList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BucketRepository;
import com.example.demo.entity.BucketEntity;
import com.example.demo.model.Bucket;

/**
 * @author Kuldeep Singh Yadav
 *
 */
@Service
public class BucketService {

	@Autowired
	private BucketRepository bucketRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private ApiCallHelper apiCallHelper;
	
	public List<Bucket> getAllByUserId(String userId){
		List<Bucket> items = new LinkedList<>();
		System.out.println(userId);
		for(BucketEntity entity : bucketRepo.findByUserId(userId)) {
			System.out.println(entity);
			items.add(modelMapper.map(entity, Bucket.class));
			apiCallHelper.getProductDetails();
		}
		return items;
	}
	
}
