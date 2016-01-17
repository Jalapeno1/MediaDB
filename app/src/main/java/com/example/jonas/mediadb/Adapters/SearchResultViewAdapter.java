package com.example.jonas.mediadb.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jonas.mediadb.Objects.MovieSearchResult;
import com.example.jonas.mediadb.R;

import java.util.ArrayList;

/**
 * Created by Jonas on 17-01-2016.
 */
public class SearchResultViewAdapter extends ArrayAdapter<MovieSearchResult> {

    private ArrayList<MovieSearchResult> movieSearchResults;

    public SearchResultViewAdapter(Context context, int resource, ArrayList<MovieSearchResult> objects) {
        super(context, resource, objects);
        this.movieSearchResults = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if(v == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.movie_layouts_search_result, null);
        }

        MovieSearchResult mo = movieSearchResults.get(position);

        if(mo != null) {
            ImageView movie_poster = (ImageView) v.findViewById(R.id.imageView_RESULT_POSTER);
            TextView movie_title = (TextView) v.findViewById(R.id.textView_RESULT_TITLE);
            TextView movie_year = (TextView) v.findViewById(R.id.textView_RESULT_YEAR);

            if(movie_poster != null){
                //new DownloadImageManager(movie_poster).execute(mo.getPoster());
            }

            if(movie_title != null){
                if(mo.getTitle().length() < 46)
                    movie_title.setText(mo.getTitle());
                else
                    movie_title.setText(mo.getTitle().substring(0, 43) + "...");
            }

            if(movie_year != null){
                movie_year.setText(mo.getYear());
            }
        }

        return v;
    }
}
