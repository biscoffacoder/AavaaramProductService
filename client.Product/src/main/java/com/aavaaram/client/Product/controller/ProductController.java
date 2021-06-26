package com.aavaaram.client.Product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aavaaram.client.Product.entity.AavaaramProducts;
import com.aavaaram.client.Product.service.AavaaramProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	AavaaramProductService service;

	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/all-products")
	public List<AavaaramProducts> getAllProducts()
	{
		LOG.info("|| getAllProducts endpoint is active ||"+ LOG.getClass());
	
		return service.getAllProducts();
	}
	
	@PostMapping("/product")
	public AavaaramProducts getProduct(@RequestParam(name="productId", required=true) String productId) 
	{
		LOG.info("|| getProduct endpoint is active ||"+ LOG.getClass());
		
		return service.getProduct(productId);
		
	}
	
	@PostMapping("/filterCategory")
	public List<AavaaramProducts> filterByCategory(@RequestParam(name="category",required=true)String category)
	{
		LOG.info("|| filterByCategory endpoint is active ||"+ LOG.getClass());
		
		return service.filterByCategory(category);
	}
	
	@PostMapping("/filterProduct")
	public List<AavaaramProducts> filterByProductName(@RequestParam(name="productName",required=true) String productName)
	{
		LOG.info("|| filterByProductName endpoint is active ||"+ LOG.getClass());
		
		return service.filterByProductName(productName);
	}
}
