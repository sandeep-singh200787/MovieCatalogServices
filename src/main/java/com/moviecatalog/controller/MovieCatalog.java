package com.moviecatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.moviecatalog.dto.Catalog;
import com.moviecatalog.dto.Movie;
import com.moviecatalog.dto.UserRating;

@RestController
public class MovieCatalog {

	@Autowired
	private RestTemplate template;
	
	@GetMapping("/catalog/{userName}")
	public Catalog getCatalog(@PathVariable("userName") String userName) {
		UserRating userRating = 
				template.getForObject("http://localhost:8083/ratings/user/"+ userName,UserRating.class);
		
		Movie movie = template.getForObject("http://localhost:8082/movieinfo", Movie.class);
		
		return new Catalog(userRating.getUserName(), movie.getName(), movie.getDescription(), userRating.getRating());
		
	}
	
}
