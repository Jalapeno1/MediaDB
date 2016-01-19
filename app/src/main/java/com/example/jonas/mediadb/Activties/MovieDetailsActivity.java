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

        new DownloadImageManager(posterImage).execute(selectedMovie.getPoster());
        setTitle(selectedMovie.getTitle());
    }
}
