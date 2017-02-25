package me.sarangpande.springrestfulapi.beans;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="movies")
public class Movies {
 
    @JacksonXmlElementWrapper(localName="movie",useWrapping=false)
    @JsonProperty("movie")
    private List<Movie> movies = new ArrayList<Movie>();
 
    public List<Movie> getMovies() {
        return movies;
    }
 
    public void setMovies(List<Movie> listOfMovies) {
        this.movies = listOfMovies;
    }
}