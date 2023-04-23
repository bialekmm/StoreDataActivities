package org.apache.maven;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rating{

	@JsonProperty("rate")
	private Object rate;

	@JsonProperty("count")
	private int count;

	public void setRate(Object rate){
		this.rate = rate;
	}

	public Object getRate(){
		return rate;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}
}