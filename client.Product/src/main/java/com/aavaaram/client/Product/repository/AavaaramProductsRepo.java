package com.aavaaram.client.Product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aavaaram.client.Product.entity.AavaaramProducts;

@Repository
public interface AavaaramProductsRepo extends MongoRepository<AavaaramProducts, String>,AavaaramProductsRepoCustomInterface {
	
}
