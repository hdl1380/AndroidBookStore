package com.example.bookstore.logic.remote;

import com.example.bookstore.logic.DataSource;
import com.example.bookstore.logic.Repository;
import com.example.bookstore.model.Movie;

import java.util.List;

import io.reactivex.Single;

public class RemoteDataSourceImpl implements DataSource {
    Repository repository;

    @Override
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Single<List<Movie>> fetchMovies(int pageNum) {
        // Repository 를 리턴
        //TODO 서버연동 및 데이터 변환
        //TODO 레트로핏 연동 / GSON / RxJava
        return null;
    }
}
