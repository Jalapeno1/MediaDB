package com.example.jonas.mediadb.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jonas.mediadb.Objects.MovieSearchResult;
import com.example.jonas.mediadb.R;
import com.example.jonas.mediadb.Utilities.DownloadImageManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonas on 17-01-2016.
 */
public class SearchResultViewAdapter extends RecyclerView.Adapter<SearchResultViewAdapter.MovieViewHolder> {

    public static class MovieViewHolder extends RecyclerView.ViewHolder {

        ImageView movie_poster;
        TextView movie_title;
        TextView movie_year;

        public MovieViewHolder(View itemView) {
            super(itemView);

            movie_poster = (ImageView) itemView.findViewById(R.id.imageView_RESULT_POSTER);
            movie_title = (TextView) itemView.findViewById(R.id.textView_RESULT_TITLE);
            movie_year = (TextView) itemView.findViewById(R.id.textView_RESULT_YEAR);
        }
    }

    List<MovieSearchResult> allMovieResults;

    public SearchResultViewAdapter(List<MovieSearchResult> movies){
        this.allMovieResults = movies;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_layouts_search_result, viewGroup, false);
        MovieViewHolder pvh = new MovieViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(MovieViewHolder movieViewHolder, int i) {
        if(movieViewHolder.movie_poster != null){
            new DownloadImageManager(movieViewHolder.movie_poster).execute(allMovieResults.get(i).getPoster());
        }

        if(movieViewHolder.movie_title != null){
            if(allMovieResults.get(i).getTitle().length() < 40)
                movieViewHolder.movie_title.setText(allMovieResults.get(i).getTitle());
            else
                movieViewHolder.movie_title.setText(allMovieResults.get(i).getTitle().substring(0, 37) + "...");
        }

        if(movieViewHolder.movie_year != null){
            movieViewHolder.movie_year.setText(Integer.toString(allMovieResults.get(i).getYear()));
        }

    }

    @Override
    public int getItemCount() {
        return allMovieResults.size();
    }


}
