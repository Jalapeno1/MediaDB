package com.example.jonas.mediadb.Objects;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jonas on 17-01-2016.
 */

public class Movie implements Parcelable {

    private String Title; //
    private String Year; //
    private String Rated; //
    private String Released; //
    private String Runtime; //
    private String Genre; //
    private String Director; //
    private String Writer; //
    private String Actors;
    private String Plot; //
    private String Country;
    private String Awards; //
    private String Poster;
    private String MetaScore; //
    private String imdbRating; //
    private String imdbVotes;
    private String imdbID;
    private String Type;

    public Movie(String title, String year, String rated, String released, String runtime,
                 String genre, String director, String writer, String actors, String plot,
                 String country, String awards, String poster, String metaScore, String imdbRating,
                 String imdbVotes, String imdbID, String type) {
        this.Title = title;
        this.Year = year;
        this.Rated = rated;
        this.Released = released;
        this.Runtime = runtime;
        this.Genre = genre;
        this.Director = director;
        this.Writer = writer;
        this.Actors = actors;
        this.Plot = plot;
        this.Country = country;
        this.Awards = awards;
        this.Poster = poster;
        this.MetaScore = metaScore;
        this.imdbRating = imdbRating;
        this.imdbVotes = imdbVotes;
        this.imdbID = imdbID;
        this.Type = type;
    }

    //small sample for search results
    public Movie(String title, String year, String imdbID, String type, String poster) {
        this.Title = title;
        this.Year = year;
        this.imdbID = imdbID;
        this.Type = type;
        this.Poster = poster;
    }

    public Movie(){}

    public String getTitle() {
        return Title;
    }

    public String getYear() {
        return Year;
    }

    public String getRated() {
        return Rated;
    }

    public String getReleased() {
        return Released;
    }

    public String getRuntime() {
        return Runtime;
    }

    public String getGenre() {
        return Genre;
    }

    public String getDirector() {
        return Director;
    }

    public String getWriter() {
        return Writer;
    }

    public String getActors() {
        return Actors;
    }

    public String getPlot() {
        return Plot;
    }

    public String getCountry() {
        return Country;
    }

    public String getAwards() {
        return Awards;
    }

    public String getPoster() {
        return Poster;
    }

    public String getMetaScore() {
        return MetaScore;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getType() {
        return Type;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    protected Movie(Parcel in) {
        Title = in.readString();
        Year = in.readString();
        Rated = in.readString();
        Released = in.readString();
        Runtime = in.readString();
        Genre = in.readString();
        Director = in.readString();
        Writer = in.readString();
        Actors = in.readString();
        Plot = in.readString();
        Country = in.readString();
        Awards = in.readString();
        Poster = in.readString();
        MetaScore = in.readString();
        imdbRating = in.readString();
        imdbVotes = in.readString();
        imdbID = in.readString();
        Type = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Title);
        dest.writeString(Year);
        dest.writeString(Rated);
        dest.writeString(Released);
        dest.writeString(Runtime);
        dest.writeString(Genre);
        dest.writeString(Director);
        dest.writeString(Writer);
        dest.writeString(Actors);
        dest.writeString(Plot);
        dest.writeString(Country);
        dest.writeString(Awards);
        dest.writeString(Poster);
        dest.writeString(MetaScore);
        dest.writeString(imdbRating);
        dest.writeString(imdbVotes);
        dest.writeString(imdbID);
        dest.writeString(Type);
    }
}


