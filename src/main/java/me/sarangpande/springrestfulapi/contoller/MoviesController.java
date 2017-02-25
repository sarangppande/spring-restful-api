package me.sarangpande.springrestfulapi.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.sarangpande.springrestfulapi.beans.Movie;
import me.sarangpande.springrestfulapi.beans.Movies;

@RestController
public class MoviesController {
 
   @RequestMapping("/allmovies")
   public Movies getAllMovies(){
      Movies movies = new Movies();
      //Add sample data
      movies.getMovies().add(new Movie("Titanic","1997",11));
      movies.getMovies().add(new Movie("The Lord of the Rings: The Return of the King","2003",11));
      movies.getMovies().add(new Movie("The Godfather Part II","1974",6));
      movies.getMovies().add(new Movie("The Dark Knight","2008",2));
      return movies;
   }
}