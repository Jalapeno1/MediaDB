package com.example.jonas.mediadb.Adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jonas.mediadb.Objects.Movie;
import com.example.jonas.mediadb.R;
import com.example.jonas.mediadb.Utilities.DownloadImageManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonas on 09-07-2015.
 */
public class MovieCollectionGridView extends RecyclerView.Adapter<MovieCollectionGridView.MovieViewHolder> implements Filterable {

    public static class MovieViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout rl;

        ImageView movie_poster;
        TextView movie_title;
        TextView movie_year;

        MovieViewHolder(View itemView) {
            super(itemView);
            rl = (RelativeLayout)itemView.findViewById(R.id.rel_layout);

            movie_poster = (ImageView) itemView.findViewById(R.id.imageView_ADD_POSTER);
            movie_title = (TextView) itemView.findViewById(R.id.textView_ADD_TITLE);
            movie_year = (TextView) itemView.findViewById(R.id.textView_ADD_YEAR);
        }
    }

    private List<Movie> allMovies;
    private List<Movie> filteredMovies;

    private MovieFilter movieFilter;

    public MovieCollectionGridView(List<Movie> movies){
        this.allMovies = movies;
        this.filteredMovies = movies;
        getFilter();
    }

    @Override
    public Filter getFilter() {
        if (movieFilter == null) {
            movieFilter = new MovieFilter();
        }

        return movieFilter;
    }

    private class MovieFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults filterResults = new FilterResults();
            if (constraint!=null && constraint.length()>0) {
                ArrayList<Movie> tempList = new ArrayList<>();

                Log.d("Filter", constraint.toString());

                // search content in movie list
                for (Movie movie : allMovies) {
                    if (movie.getTitle().toLowerCase().contains(constraint.toString().toLowerCase())) {
                        tempList.add(movie);
                        Log.d("Filtered", Integer.toString(movie.getYear()));
                    }
                }

                filterResults.count = tempList.size();
                filterResults.values = tempList;
            } else {
                filterResults.count = allMovies.size();
                filterResults.values = allMovies;
            }

            return filterResults;
        }

        /**
         * Notify about filtered list to ui
         * @param constraint text
         * @param results filtered result
         */
        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredMovies = (ArrayList<Movie>) results.values;
            notifyDataSetChanged();
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_collection_gridview, viewGroup, false);
        MovieViewHolder pvh = new MovieViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(final MovieViewHolder movieViewHolder, final int i) {

        movieViewHolder.rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Movie MOVIE_TO_VIEW = allMovies.get(i);
//
//                Intent i = new Intent(v.getContext(), MovieDetailsActivity.class);
//                i.putExtra("OBJECT_ZERO", MOVIE_TO_VIEW);
//                v.getContext().startActivity(i);
            }
        });

        if(movieViewHolder.movie_poster != null){
            new DownloadImageManager(movieViewHolder.movie_poster).execute(filteredMovies.get(i).getPoster());
        }

        if(movieViewHolder.movie_title != null){
            if(filteredMovies.get(i).getTitle().length() < 26)
                movieViewHolder.movie_title.setText(filteredMovies.get(i).getTitle());
            else
                movieViewHolder.movie_title.setText(filteredMovies.get(i).getTitle().substring(0, 23) + "...");
        }

        if(movieViewHolder.movie_year != null){
            movieViewHolder.movie_year.setText(Integer.toString(filteredMovies.get(i).getYear()));
        }

        movieViewHolder.rl.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return true;
            }
        });
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemCount() {
        return filteredMovies.size();
    }
}