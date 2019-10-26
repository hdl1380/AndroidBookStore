package com.example.bookstore.main;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bookstore.R;
import com.example.bookstore.model.Movie;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainAdapterViewHolder> {
    List<Movie> movies;
    MainContract.Presenter presenter;

    public MainAdapter(List<Movie> movies, MainContract.Presenter presenter) {
        this.movies = movies;
        this.presenter = presenter;
    }

    // 1. ViewHolder
    public static class MainAdapterViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView title;
        TextView summery;

        public MainAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            this.thumbnail = itemView.findViewById(R.id.thumbnail);
            this.title = itemView.findViewById(R.id.title);
            this.summery = itemView.findViewById(R.id.summery);
        }
    }

    @NonNull
    @Override
    public MainAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gallery_view, parent, false);
        return new MainAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapterViewHolder holder, int position) {
        Movie movie = movies.get(position);
        String thmubnailPath = movie.getMediumCoverImage();
        Log.d("adapter", thmubnailPath);
        Glide.with(holder.itemView.getContext())
                .load(thmubnailPath)
                .into(holder.thumbnail);
        holder.title.setText(movie.getTitle());
        holder.summery.setText(movie.getSummary());

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    // 2. onCreateViewHolder

    // 3. onBindViewHolder

    // 4. getItemCount
}
