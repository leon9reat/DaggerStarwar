package com.medialink.daggerstarwar.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Films{

	@SerializedName("edited")
	private String edited;

	@SerializedName("director")
	private String director;

	@SerializedName("created")
	private String created;

	@SerializedName("vehicles")
	private List<String> vehicles;

	@SerializedName("opening_crawl")
	private String openingCrawl;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	@SerializedName("characters")
	private List<String> characters;

	@SerializedName("episode_id")
	private int episodeId;

	@SerializedName("planets")
	private List<String> planets;

	@SerializedName("release_date")
	private String releaseDate;

	@SerializedName("starships")
	private List<String> starships;

	@SerializedName("species")
	private List<String> species;

	@SerializedName("producer")
	private String producer;

	public void setEdited(String edited){
		this.edited = edited;
	}

	public String getEdited(){
		return edited;
	}

	public void setDirector(String director){
		this.director = director;
	}

	public String getDirector(){
		return director;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setVehicles(List<String> vehicles){
		this.vehicles = vehicles;
	}

	public List<String> getVehicles(){
		return vehicles;
	}

	public void setOpeningCrawl(String openingCrawl){
		this.openingCrawl = openingCrawl;
	}

	public String getOpeningCrawl(){
		return openingCrawl;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setCharacters(List<String> characters){
		this.characters = characters;
	}

	public List<String> getCharacters(){
		return characters;
	}

	public void setEpisodeId(int episodeId){
		this.episodeId = episodeId;
	}

	public int getEpisodeId(){
		return episodeId;
	}

	public void setPlanets(List<String> planets){
		this.planets = planets;
	}

	public List<String> getPlanets(){
		return planets;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setStarships(List<String> starships){
		this.starships = starships;
	}

	public List<String> getStarships(){
		return starships;
	}

	public void setSpecies(List<String> species){
		this.species = species;
	}

	public List<String> getSpecies(){
		return species;
	}

	public void setProducer(String producer){
		this.producer = producer;
	}

	public String getProducer(){
		return producer;
	}

	@Override
 	public String toString(){
		return 
			"Films{" + 
			"edited = '" + edited + '\'' + 
			",director = '" + director + '\'' + 
			",created = '" + created + '\'' + 
			",vehicles = '" + vehicles + '\'' + 
			",opening_crawl = '" + openingCrawl + '\'' + 
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			",characters = '" + characters + '\'' + 
			",episode_id = '" + episodeId + '\'' + 
			",planets = '" + planets + '\'' + 
			",release_date = '" + releaseDate + '\'' + 
			",starships = '" + starships + '\'' + 
			",species = '" + species + '\'' + 
			",producer = '" + producer + '\'' + 
			"}";
		}
}