package com.aavaaram.client.Product.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "Products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public final class AavaaramProducts {

	@Id
	private String id;
	
	private int productId;
	
	private String productName;
	
	private String category;
	
	private int price;
	
	private String availability;
	
	private int weight;
	
	private String unit;
	
	
}
