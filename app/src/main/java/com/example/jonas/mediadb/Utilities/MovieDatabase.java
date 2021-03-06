package com.example.jonas.mediadb.Utilities;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.jonas.mediadb.Objects.Movie;

import java.util.ArrayList;

/**
 * Created by Jonas on 02-07-2015.
 */
public class MovieDatabase extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "movieDB.db";
    private static final String TABLE_MOVIES = "movies";

    public static final String COLUMN_TITLE = "movieTitle";
    public static final String COLUMN_YEAR = "movieYear";
    public static final String COLUMN_RATED = "movieRating";
    public static final String COLUMN_RELEASED = "movieRelease";
    public static final String COLUMN_RUNTIME = "movieRuntime";
    public static final String COLUMN_GENRE = "movieGenre";
    public static final String COLUMN_DIRECTOR = "movieDirector";
    public static final String COLUMN_WRITER = "movieWriter";
    public static final String COLUMN_ACTORS = "movieActors";
    public static final String COLUMN_PLOT = "moviePlot";
    public static final String COLUMN_COUNTRY = "movieCountry";
    public static final String COLUMN_AWARDS = "movieAwards";
    public static final String COLUMN_POSTER = "moviePoster";
    public static final String COLUMN_METASCORE = "movieMetaScore";
    public static final String COLUMN_IMDB_RATING = "movieImdbRating";
    public static final String COLUMN_IMDB_VOTES = "movieImdbVotes";
    public static final String COLUMN_IMDB_ID = "movieImdbID";
    public static final String COLUMN_TYPE = "movieType";

    public MovieDatabase(Context context, String name,
                         SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_MOVIES_TABLE = "CREATE TABLE " +
                TABLE_MOVIES + "("
                + COLUMN_TITLE + " TEXT,"
                + COLUMN_YEAR + " TEXT,"
                + COLUMN_RATED + " TEXT,"
                + COLUMN_RELEASED + " TEXT,"
                + COLUMN_RUNTIME + " TEXT,"
                + COLUMN_GENRE + " TEXT,"
                + COLUMN_DIRECTOR + " TEXT,"
                + COLUMN_WRITER + " TEXT,"
                + COLUMN_ACTORS + " TEXT,"
                + COLUMN_PLOT + " TEXT,"
                + COLUMN_COUNTRY + " TEXT,"
                + COLUMN_AWARDS + " TEXT,"
                + COLUMN_POSTER + " TEXT,"
                + COLUMN_METASCORE + " TEXT,"
                + COLUMN_IMDB_RATING + " TEXT,"
                + COLUMN_IMDB_VOTES + " TEXT,"
                + COLUMN_IMDB_ID + " TEXT UNIQUE,"
                + COLUMN_TYPE + " TEXT"
                + ")";
        db.execSQL(CREATE_MOVIES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MOVIES);
        onCreate(db);

    }

    public void addMovie(Movie movieObject) {

        ContentValues values = new ContentValues();
        values.put(COLUMN_TITLE, movieObject.getTitle());
        values.put(COLUMN_YEAR, movieObject.getYear());
        values.put(COLUMN_RATED, movieObject.getRated());
        values.put(COLUMN_RELEASED, movieObject.getReleased());
        values.put(COLUMN_RUNTIME, movieObject.getRuntime());
        values.put(COLUMN_GENRE, movieObject.getGenre());
        values.put(COLUMN_DIRECTOR, movieObject.getDirector());
        values.put(COLUMN_WRITER, movieObject.getWriter());
        values.put(COLUMN_ACTORS, movieObject.getActors());
        values.put(COLUMN_PLOT, movieObject.getPlot());
        values.put(COLUMN_COUNTRY, movieObject.getCountry());
        values.put(COLUMN_POSTER, movieObject.getPoster());
        values.put(COLUMN_IMDB_RATING, movieObject.getImdbRating());
        values.put(COLUMN_IMDB_ID, movieObject.getImdbID());

        SQLiteDatabase db = this.getWritableDatabase();

        db.insertWithOnConflict(TABLE_MOVIES, null, values, SQLiteDatabase.CONFLICT_REPLACE);
        db.close();
    }

    public ArrayList<Movie> getAllMovies() {
        ArrayList<Movie> list = new ArrayList<>();
        String query = "Select * FROM " + TABLE_MOVIES;

        SQLiteDatabase db = this.getWritableDatabase();
        try{
            Cursor cursor = db.rawQuery(query, null);
            try{
                if (cursor.moveToFirst()) {
                    do {
                        Movie movieObject = new Movie(cursor.getString(0), cursor.getString(1), cursor.getString(2),
                                cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6),
                                cursor.getString(7), cursor.getString(8), cursor.getString(9), cursor.getString(10),
                                cursor.getString(11), cursor.getString(12), cursor.getString(13), cursor.getString(14),
                                cursor.getString(15), cursor.getString(16), cursor.getString(17));

                        //Adds all objects to list
                        list.add(movieObject);

                    } while (cursor.moveToNext());
                }
            } finally {
                try { cursor.close(); } catch (Exception ignore) {}
            }
        }finally {
            try { db.close(); } catch (Exception ignore) {}
        }
        return list;
    }

    public boolean deleteMovie(String imdbID) {

        boolean result = false;

        String query = "Select * FROM " + TABLE_MOVIES + " WHERE " + COLUMN_IMDB_ID + " =  \"" + imdbID + "\"";

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        Movie movieObject = new Movie();

        if (cursor.moveToFirst()) {
            movieObject.setImdbID(cursor.getString(13));
            db.delete(TABLE_MOVIES, COLUMN_IMDB_ID + " = ?",
                    new String[]{String.valueOf(movieObject.getImdbID())});
            cursor.close();
            result = true;
        }
        db.close();
        return result;
    }

    public void deleteAllMovies(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from "+TABLE_MOVIES);
    }
}
