package com.example.bookstore.logic.remote.services;

import com.example.bookstore.model.Movie;
import com.example.bookstore.model.ResponseMovie;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

//Movie와 관련 내용을 담는다
public interface MovieApiService {
    @GET("list_movies.json")
    Single<ResponseMovie> fetchMovies();
}
