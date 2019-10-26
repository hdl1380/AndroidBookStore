package com.example.bookstore.logic;

import com.example.bookstore.model.Movie;

import java.util.List;

import io.reactivex.Single;

public interface DataSource {
    void setRepository(Repository repository);

    Single<List<Movie>> fetchMovies(int pageNum);
}
