package com.example.jonas.mediadb.Activties;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jonas.mediadb.Objects.Movie;
import com.example.jonas.mediadb.R;
import com.example.jonas.mediadb.Utilities.DownloadImageManager;

public class MovieDetailsActivity extends AppCompatActivity {

    private ImageView posterImage;
    private TextView detailsTitle;
    private TextView detailsYear;
    private TextView detailsGenre;
    private TextView detailsRuntime;
    private TextView detailsPlot;
    private TextView detailsDirector;
    private TextView detailsWriter;
    private TextView detailsReleased;
    private TextView detailsRated;
    private TextView detailsImdbRating;
    private TextView detailsMetaScore;
    private TextView detailsAwards;

    private Movie selectedMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        Intent i = getIntent();
        selectedMovie = i.getParcelableExtra("selectedMovie");

        setUpDetails();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void setUpDetails(){
        posterImage = (ImageView)findViewById(R.id.posterView);
        detailsTitle = (TextView)findViewById(R.id.textView_DETAILS_TITLE);
        detailsYear = (TextView)findViewById(R.id.textView_DETAILS_YEAR);
        detailsGenre = (TextView)findViewById(R.id.textView_DETAILS_GENRE);
        detailsRuntime = (TextView)findViewById(R.id.textView_DETAILS_RUNTIME);
        detailsPlot = (TextView)findViewById(R.id.textView_DETAILS_PLOT);
        detailsDirector = (TextView)findViewById(R.id.textView_DETAILS_DIRECTOR);
        detailsWriter = (TextView)findViewById(R.id.textView_DETAILS_WRITER);
        detailsReleased = (TextView)findViewById(R.id.textView_DETAILS_RELEASED);
        detailsRated = (TextView)findViewById(R.id.textView_DETAILS_RATED);
        detailsImdbRating = (TextView)findViewById(R.id.textView_DETAILS_IMDB_RATING);
        detailsMetaScore = (TextView)findViewById(R.id.textView_DETAILS_METASCORE);
        detailsAwards = (TextView)findViewById(R.id.textView_DETAILS_AWARDS);

        new DownloadImageManager(posterImage).execute(selectedMovie.getPoster());
        setTitle(selectedMovie.getTitle());
        detailsTitle.setText(selectedMovie.getTitle());
        detailsYear.setText(selectedMovie.getYear());
        detailsGenre.setText(selectedMovie.getGenre().replace(", ", " | "));
        detailsRuntime.setText(selectedMovie.getRuntime());
        detailsPlot.setText(selectedMovie.getPlot());
        detailsDirector.setText(getString(R.string.details_director) + selectedMovie.getDirector());
        detailsWriter.setText(getString(R.string.details_writer) + selectedMovie.getWriter());
        detailsReleased.setText(getString(R.string.details_released) + selectedMovie.getReleased());
        detailsRated.setText(getString(R.string.details_rated) + selectedMovie.getRated());
        detailsImdbRating.setText(selectedMovie.getImdbRating());
        detailsMetaScore.setText(selectedMovie.getMetascore());
        detailsAwards.setText(selectedMovie.getAwards());
    }
}
