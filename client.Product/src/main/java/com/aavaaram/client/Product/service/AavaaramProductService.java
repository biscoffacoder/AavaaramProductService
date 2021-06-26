package com.aavaaram.client.Product.service;

import java.util.List;

import com.aavaaram.client.Product.entity.AavaaramProducts;

public interface AavaaramProductService {

	List<AavaaramProducts> getAllProducts();

	AavaaramProducts getProduct(String productId);

	List<AavaaramProducts> filterByCategory(String category);

	List<AavaaramProducts> filterByProductName(String productName);

	
}
