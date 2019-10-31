package com.medialink.daggerstarwar.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class People{

	@SerializedName("next")
	private String next;

	@SerializedName("previous")
	private Object previous;

	@SerializedName("count")
	private int count;

	@SerializedName("results")
	private List<PeopleItem> results;

	public void setNext(String next){
		this.next = next;
	}

	public String getNext(){
		return next;
	}

	public void setPrevious(Object previous){
		this.previous = previous;
	}

	public Object getPrevious(){
		return previous;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setResults(List<PeopleItem> results){
		this.results = results;
	}

	public List<PeopleItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"People{" + 
			"next = '" + next + '\'' + 
			",previous = '" + previous + '\'' + 
			",count = '" + count + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}