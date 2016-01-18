package com.example.jonas.mediadb.Objects;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jonas on 17-01-2016.
 */

public class Movie implements Parcelable {

    private String Title;
    private int Year;
    private String Rated;
    private String Released;
    private String Runtime;
    private String Genre;
    private String Director;
    private String Writer;
    private String Actors;
    private String Plot;
    private String Country;
    private String Awards;
    private String Poster;
    private int MetaScore;
    private float imdbRating;
    private int imdbVotes;
    private String imdbID;
    private String Type;

    public Movie(String title, int year, String rated, String released, String runtime,
                 String genre, String director, String writer, String actors, String plot,
                 String country, String awards, String poster, int metaScore, float imdbRating,
                 int imdbVotes, String imdbID, String type) {
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
    public Movie(String title, int year, String imdbID, String type, String poster) {
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

    public int getMetaScore() {
        return MetaScore;
    }

    public float getImdbRating() {
        return imdbRating;
    }

    public int getImdbVotes() {
        return imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getType() {
        return Type;
    }

    protected Movie(Parcel in) {
        Title = in.readString();
        Year = in.readInt();
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
        MetaScore = in.readInt();
        imdbRating = in.readFloat();
        imdbVotes = in.readInt();
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
        dest.writeInt(Year);
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
        dest.writeInt(MetaScore);
        dest.writeFloat(imdbRating);
        dest.writeInt(imdbVotes);
        dest.writeString(imdbID);
        dest.writeString(Type);
    }
}


