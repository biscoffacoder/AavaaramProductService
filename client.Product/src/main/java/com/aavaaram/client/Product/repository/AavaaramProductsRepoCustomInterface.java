package com.aavaaram.client.Product.repository;

import java.util.List;

import com.aavaaram.client.Product.entity.AavaaramProducts;

public interface AavaaramProductsRepoCustomInterface {
	List<AavaaramProducts> getAllAavaaramProducts();
	
	AavaaramProducts getProduct(String productId);
	
	List<AavaaramProducts> filterByCategory(String category);
	
	List<AavaaramProducts> filterByProductName(String productName);
}
