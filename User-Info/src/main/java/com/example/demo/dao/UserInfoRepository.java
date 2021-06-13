/**
 * 
 */
package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserInfoEntity;

/**
 * @author Kuldeep Singh Yadav
 *
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, String> {

	public List<UserInfoEntity> findAll() ;
}
