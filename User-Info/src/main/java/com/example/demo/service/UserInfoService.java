/**
 * 
 */
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.UserInfo;
import com.example.demo.dao.UserInfoRepository;
import com.example.demo.entity.UserInfoEntity;

/**
 * @author Kuldeep Singh Yadav
 *
 */
@Service
@Transactional
public class UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<UserInfo> getAll(){
		List<UserInfoEntity> userEntities = userInfoRepo.findAll();
		List<UserInfo> users = new ArrayList<>();
		for(UserInfoEntity entity : userEntities) {
			users.add(modelMapper.map(entity, UserInfo.class));
		}
		return users;
	}
}
