package me.sarangpande.springrestfulapi.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="movie")
public class Movie {
 
    private String name;
    @JsonProperty("year-of-release")
    private String yearOfRelease;
    @JsonProperty("number-of-awards")
    private int numberOfAwards;
 
    public Movie(String name, String yearOfRelease, int numberOfAwards) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.numberOfAwards = numberOfAwards;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getYearOfRelease() {
        return yearOfRelease;
    }
    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    public int getNumberOfAwards() {
        return numberOfAwards;
    }
    public void setNumberOfAwards(int numberOfAwards) {
        this.numberOfAwards = numberOfAwards;
    }
}