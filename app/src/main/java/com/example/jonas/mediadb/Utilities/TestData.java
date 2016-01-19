package com.example.jonas.mediadb.Utilities;

import com.example.jonas.mediadb.Objects.Movie;

import java.util.ArrayList;

/**
 * Created by Jonas on 18-01-2016.
 */
public class TestData {

    public ArrayList<Movie> getTestData_MoviesFromSearch = new ArrayList<>();
    public ArrayList<Movie> getTestData_MoviesSaved = new ArrayList<>();

    public TestData(){

        getTestData_MoviesFromSearch.add(new Movie("Lord of The Rings: The Fellowship of The Ring And so on and on and on and on", 2001,
                "test", "test", "http://ia.media-imdb.com/images/M/MV5BNTEyMjAwMDU1OV5BMl5BanBnXkFtZTcwNDQyNTkxMw@@._V1_SX300.jpg"));
        getTestData_MoviesFromSearch.add(new Movie("Something", 2010, "test", "test", "http://ia.media-imdb.com/images/M/MV5BMTY1NTY0NTg3Nl5BMl5BanBnXkFtZTgwNTUzOTk1MDE@._V1_SX300.jpg"));
        getTestData_MoviesFromSearch.add(new Movie("Jurassic Park", 1993, "test", "test","http://ia.media-imdb.com/images/M/MV5BMjM2MDgxMDg0Nl5BMl5BanBnXkFtZTgwNTM2OTM5NDE@._V1_SX300.jpg"));
        getTestData_MoviesFromSearch.add(new Movie("Evil Dead", 2013, "test", "test", "http://ia.media-imdb.com/images/M/MV5BNTQ3OTkwNTgyN15BMl5BanBnXkFtZTcwNTAzOTAzOQ@@._V1_SX300.jpg"));
        getTestData_MoviesFromSearch.add(new Movie("test1", 2001,
                "test", "test", "http://ia.media-imdb.com/images/M/MV5BNTEyMjAwMDU1OV5BMl5BanBnXkFtZTcwNDQyNTkxMw@@._V1_SX300.jpg"));
        getTestData_MoviesFromSearch.add(new Movie("test12", 2010, "test", "test", "http://ia.media-imdb.com/images/M/MV5BMTY1NTY0NTg3Nl5BMl5BanBnXkFtZTgwNTUzOTk1MDE@._V1_SX300.jpg"));
        getTestData_MoviesFromSearch.add(new Movie("test13 Park", 1993, "test", "test","http://ia.media-imdb.com/images/M/MV5BMjM2MDgxMDg0Nl5BMl5BanBnXkFtZTgwNTM2OTM5NDE@._V1_SX300.jpg"));
        getTestData_MoviesFromSearch.add(new Movie("test1344", 2013, "test", "test", "http://ia.media-imdb.com/images/M/MV5BNTQ3OTkwNTgyN15BMl5BanBnXkFtZTcwNTAzOTAzOQ@@._V1_SX300.jpg"));
        getTestData_MoviesFromSearch.add(new Movie("test14124", 2001,
                "test", "test", "http://ia.media-imdb.com/images/M/MV5BNTEyMjAwMDU1OV5BMl5BanBnXkFtZTcwNDQyNTkxMw@@._V1_SX300.jpg"));
        getTestData_MoviesFromSearch.add(new Movie("test17687845", 2010, "test", "test", "http://ia.media-imdb.com/images/M/MV5BMTY1NTY0NTg3Nl5BMl5BanBnXkFtZTgwNTUzOTk1MDE@._V1_SX300.jpg"));
        getTestData_MoviesFromSearch.add(new Movie("test1wer234", 1993, "test", "test","http://ia.media-imdb.com/images/M/MV5BMjM2MDgxMDg0Nl5BMl5BanBnXkFtZTgwNTM2OTM5NDE@._V1_SX300.jpg"));
        getTestData_MoviesFromSearch.add(new Movie("test12332344", 2013, "test", "test", "http://ia.media-imdb.com/images/M/MV5BNTQ3OTkwNTgyN15BMl5BanBnXkFtZTcwNTAzOTAzOQ@@._V1_SX300.jpg"));

        getTestData_MoviesSaved.add(new Movie("Jurassic Park", 1993, "PG-13", "October 1993", "120 min", "Horror, Adventure, Fantasy", "Steven Spielberg", "Wierd Al", "Kid #1, Kid #2", "DINOS", "USA", "Dont remember",
                "http://ia.media-imdb.com/images/M/MV5BMjM2MDgxMDg0Nl5BMl5BanBnXkFtZTgwNTM2OTM5NDE@._V1_SX300.jpg", 85, 8.5, 100000, "test", "movie"));
        getTestData_MoviesSaved.add(new Movie("Lord of The Rings: The Fellowship of The Ring", 2001, "PG-13", "December 2001", "200 min", "Action, Fantasy", "Peter Jackson", "J.R.R. Tolkien", "Hobbit #1, Hobbit #2", "Something with a ring", "New Zealand",
                "A lot.", "http://ia.media-imdb.com/images/M/MV5BNTEyMjAwMDU1OV5BMl5BanBnXkFtZTcwNDQyNTkxMw@@._V1_SX300.jpg", 90, 9.0, 400000, "test", "movie"));
        getTestData_MoviesSaved.add(new Movie("Evil Dead", 2013, "R", "June 2013", "120 min", "Horror", "Not Sam Raimi", "Not Sam Raimi", "Teenager #1, Teenager #2", "Swallow This!", "USA! USA!", "AWARDS? HA!",
                "http://ia.media-imdb.com/images/M/MV5BNTQ3OTkwNTgyN15BMl5BanBnXkFtZTcwNTAzOTAzOQ@@._V1_SX300.jpg", 75, 7.5, 10000, "test", "movie"));
        getTestData_MoviesSaved.add(new Movie("Jurassic Park", 1993, "PG-13", "October 1993", "120 min", "Horror, Adventure, Fantasy", "Steven Spielberg", "Wierd Al", "Kid #1, Kid #2", "DINOS", "USA", "Dont remember",
                "http://ia.media-imdb.com/images/M/MV5BMjM2MDgxMDg0Nl5BMl5BanBnXkFtZTgwNTM2OTM5NDE@._V1_SX300.jpg", 85, 8.5, 100000, "test", "movie"));
        getTestData_MoviesSaved.add(new Movie("Lord of The Rings: The Fellowship of The Ring", 2001, "PG-13", "December 2001", "200 min", "Action, Fantasy", "Peter Jackson", "J.R.R. Tolkien", "Hobbit #1, Hobbit #2", "Something with a ring", "New Zealand",
                "A lot.", "http://ia.media-imdb.com/images/M/MV5BNTEyMjAwMDU1OV5BMl5BanBnXkFtZTcwNDQyNTkxMw@@._V1_SX300.jpg", 90, 9.0, 400000, "test", "movie"));
        getTestData_MoviesSaved.add(new Movie("Evil Dead", 2013, "R", "June 2013", "120 min", "Horror", "Not Sam Raimi", "Not Sam Raimi", "Teenager #1, Teenager #2", "Swallow This!", "USA! USA!", "AWARDS? HA!",
                "http://ia.media-imdb.com/images/M/MV5BNTQ3OTkwNTgyN15BMl5BanBnXkFtZTcwNTAzOTAzOQ@@._V1_SX300.jpg", 75, 7.5, 10000, "test", "movie"));
        getTestData_MoviesSaved.add(new Movie("Jurassic Park", 1993, "PG-13", "October 1993", "120 min", "Horror, Adventure, Fantasy", "Steven Spielberg", "Wierd Al", "Kid #1, Kid #2", "DINOS", "USA", "Dont remember",
                "http://ia.media-imdb.com/images/M/MV5BMjM2MDgxMDg0Nl5BMl5BanBnXkFtZTgwNTM2OTM5NDE@._V1_SX300.jpg", 85, 8.5, 100000, "test", "movie"));
        getTestData_MoviesSaved.add(new Movie("Lord of The Rings: The Fellowship of The Ring", 2001, "PG-13", "December 2001", "200 min", "Action, Fantasy", "Peter Jackson", "J.R.R. Tolkien", "Hobbit #1, Hobbit #2", "Something with a ring", "New Zealand",
                "A lot.", "http://ia.media-imdb.com/images/M/MV5BNTEyMjAwMDU1OV5BMl5BanBnXkFtZTcwNDQyNTkxMw@@._V1_SX300.jpg", 90, 9.0, 400000, "test", "movie"));
        getTestData_MoviesSaved.add(new Movie("Evil Dead", 2013, "R", "June 2013", "120 min", "Horror", "Not Sam Raimi", "Not Sam Raimi", "Teenager #1, Teenager #2", "Swallow This!", "USA! USA!", "AWARDS? HA!",
                "http://ia.media-imdb.com/images/M/MV5BNTQ3OTkwNTgyN15BMl5BanBnXkFtZTcwNTAzOTAzOQ@@._V1_SX300.jpg", 75, 7.5, 10000, "test", "movie"));

    }
}
