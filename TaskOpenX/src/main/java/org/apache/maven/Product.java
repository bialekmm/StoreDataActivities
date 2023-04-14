package org.apache.maven;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Product{

	@JsonProperty("Product")
	private List<ProductItem> product;

	public void setProduct(List<ProductItem> product){
		this.product = product;
	}

	public List<ProductItem> getProduct(){
		return product;
	}
}