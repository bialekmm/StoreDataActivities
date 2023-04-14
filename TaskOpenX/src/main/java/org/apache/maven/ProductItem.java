package org.apache.maven;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("price")
	private Object price;

	@JsonProperty("rating")
	private Rating rating;

	@JsonProperty("description")
	private String description;

	@JsonProperty("id")
	private int id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("category")
	private String category;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return (double)price;
	}

	public void setRating(Rating rating){
		this.rating = rating;
	}

	public Rating getRating(){
		return rating;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}
}