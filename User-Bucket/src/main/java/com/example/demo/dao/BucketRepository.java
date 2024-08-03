/**
 *
 */
package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BucketEntity;

/**
 * @author Kuldeep Singh Yadav
 *
 */
@Repository
public interface BucketRepository extends JpaRepository<BucketEntity, Integer> {

    @Override
    public List<BucketEntity> findAll();

    public List<BucketEntity> findByUserId(String userId);
}
