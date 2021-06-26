package com.aavaaram.client.Product.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.aavaaram.client.Product.entity.AavaaramProducts;

public class AavaaramProductsRepoImpl implements AavaaramProductsRepoCustomInterface {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private MongoTemplate productRepo;

	@Override
	public List<AavaaramProducts> getAllAavaaramProducts() {
		LOG.info("|| getAllAavaaramProducts Repository call is active ||"+ LOG.getClass());


		return (List<AavaaramProducts>) productRepo.findAll(AavaaramProducts.class);
	}
	@Override
	public AavaaramProducts getProduct(String productId) {

		// TODO Auto-generated method stub
		LOG.info("|| getProduct Repository call is active ||"+ LOG.getClass());

		
		Query query = new Query();
		query.addCriteria(Criteria.where("productId").is(productId));

		return productRepo.findOne(query, AavaaramProducts.class);
	}
	@Override
	public List<AavaaramProducts> filterByCategory(String category) {
		LOG.info("|| filterByCategory Repository call is active ||"+ LOG.getClass());

		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("category").is(category));

		return productRepo.find(query,AavaaramProducts.class);
	}
	@Override
	public List<AavaaramProducts> filterByProductName(String productName) {
		LOG.info("|| filterByProductName Repository call is active ||"+ LOG.getClass());

		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("productName").is(productName));

		return productRepo.find(query,AavaaramProducts.class);
	}

}
