package com.example.jonas.mediadb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jonas.mediadb.Adapters.SearchResultViewAdapter;
import com.example.jonas.mediadb.Objects.MovieSearchResult;

import java.util.ArrayList;

public class SearchResultActivity extends AppCompatActivity {

    private ArrayList<MovieSearchResult> movies;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        rv = (RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        rv.setHasFixedSize(true);

        initializeTestData(); //for testing

        SearchResultViewAdapter adapter = new SearchResultViewAdapter(movies);
        rv.setAdapter(adapter);
    }

    private void initializeTestData(){
        movies = new ArrayList<>();
        MovieSearchResult mo1, mo2, mo3, mo4, mo5, mo6, mo7;

        mo1 = new MovieSearchResult("Lord of The Rings: The Fellowship of The Ring And so on and on and on and on", 2001, "test", "test", "http://ia.media-imdb.com/images/M/MV5BNTEyMjAwMDU1OV5BMl5BanBnXkFtZTcwNDQyNTkxMw@@._V1_SX300.jpg");
        mo2 = new MovieSearchResult("Something", 2010, "test", "test", "http://ia.media-imdb.com/images/M/MV5BMTY1NTY0NTg3Nl5BMl5BanBnXkFtZTgwNTUzOTk1MDE@._V1_SX300.jpg");
        mo3 = new MovieSearchResult("Jurassic Park", 1993, "test", "test","http://ia.media-imdb.com/images/M/MV5BMjM2MDgxMDg0Nl5BMl5BanBnXkFtZTgwNTM2OTM5NDE@._V1_SX300.jpg");
        mo4 = new MovieSearchResult("Evil Dead", 2013, "test", "test", "http://ia.media-imdb.com/images/M/MV5BNTQ3OTkwNTgyN15BMl5BanBnXkFtZTcwNTAzOTAzOQ@@._V1_SX300.jpg");
        mo5 = new MovieSearchResult("Lord of The Rings: The Fellowship of The Ring And so on and on and on and on", 2001, "test", "test", "http://ia.media-imdb.com/images/M/MV5BNTEyMjAwMDU1OV5BMl5BanBnXkFtZTcwNDQyNTkxMw@@._V1_SX300.jpg");
        mo6 = new MovieSearchResult("Something", 2010, "test", "test", "http://ia.media-imdb.com/images/M/MV5BMTY1NTY0NTg3Nl5BMl5BanBnXkFtZTgwNTUzOTk1MDE@._V1_SX300.jpg");
        mo7 = new MovieSearchResult("Jurassic Park", 1993, "test", "test", "http://ia.media-imdb.com/images/M/MV5BMjM2MDgxMDg0Nl5BMl5BanBnXkFtZTgwNTM2OTM5NDE@._V1_SX300.jpg");


        movies.add(mo1);
        movies.add(mo2);
        movies.add(mo3);
        movies.add(mo4);
        movies.add(mo5);
        movies.add(mo6);
        movies.add(mo7);
    }
}
