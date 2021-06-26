package com.aavaaram.client.Product.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aavaaram.client.Product.entity.AavaaramProducts;
import com.aavaaram.client.Product.repository.AavaaramProductsRepo;

@Service
public class AavaaramProductServiceImpl implements AavaaramProductService {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	AavaaramProductsRepo productsRepo;

	

	@Override
	public List<AavaaramProducts> getAllProducts() {
		LOG.info("|| getAllProducts Service call is active ||"+ LOG.getClass());

		return productsRepo.getAllAavaaramProducts();
	}

	@Override
	public AavaaramProducts getProduct(String productId) {
		LOG.info("|| getProduct Service call is active ||"+ LOG.getClass());

		return productsRepo.getProduct(productId);
	}

	@Override
	public List<AavaaramProducts> filterByCategory(String category) {
		LOG.info("|| filterByCategory Service call is active ||"+ LOG.getClass());

		
		return productsRepo.filterByCategory(category);
	}

	@Override
	public List<AavaaramProducts> filterByProductName(String productName) {
		LOG.info("|| filterByProductName Service call is active ||"+ LOG.getClass());

		return productsRepo.filterByProductName(productName);
	}
}
