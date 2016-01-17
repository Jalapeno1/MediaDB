package com.example.jonas.mediadb.Objects;

/**
 * Created by Jonas on 17-01-2016.
 */
public class MovieSearchResult {

    private String Title;
    private int Year;
    private String imdbID;
    private String Type;
    private String Poster;

    public MovieSearchResult(String title, int year, String imdbID, String type, String poster) {
        this.Title = title;
        this.Year = year;
        this.imdbID = imdbID;
        this.Type = type;
        this.Poster = poster;
    }

    public String getTitle() {
        return Title;
    }

    public int getYear() {
        return Year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getType() {
        return Type;
    }

    public String getPoster() {
        return Poster;
    }
}
