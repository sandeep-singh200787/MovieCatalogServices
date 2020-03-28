package com.moviecatalog.dto;

public class Catalog {
	
	private String userName;
	private String movieName;
	private String description;
	private int rating;
	
	public Catalog() {
	}

	public Catalog(String userName, String movieName, String description, int rating) {
		super();
		this.userName = userName;
		this.movieName = movieName;
		this.description = description;
		this.rating = rating;
	}







	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getdescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	

}
