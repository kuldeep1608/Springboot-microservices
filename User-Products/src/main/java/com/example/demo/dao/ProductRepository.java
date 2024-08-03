/**
 *
 */
package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ProductEntity;

/**
 * @author Kuldeep Singh Yadav
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, String> {

    public List<ProductEntity> findAll();

}
