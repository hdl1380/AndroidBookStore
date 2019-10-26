package com.example.bookstore.logic;

import com.example.bookstore.base.BasePresenter;
import com.example.bookstore.model.Movie;

import java.util.List;

import io.reactivex.Single;

public interface Repository<T> {
    void setPresenter(BasePresenter<T> presenter);

    Single<List<Movie>> fetchMovies(int pageNum);
}
