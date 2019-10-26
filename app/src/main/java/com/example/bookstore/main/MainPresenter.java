package com.example.bookstore.main;

import android.util.Log;

import com.example.bookstore.base.BasePresenterImpl;
import com.example.bookstore.logic.Repository;
import com.example.bookstore.logic.RepositoryImpl;
import com.example.bookstore.model.Movie;

import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter extends BasePresenterImpl<MainContract.View>
    implements MainContract.Presenter
{
    Repository repository;
    MainPresenter() {
        this.repository = new RepositoryImpl();
        this.repository.setPresenter(this);
    }

    @Override
    public void fetchMovies(int pageNum) {
        //TODO Repository 에 데이터를 가져오도록 명령
        //TODO RxJava 로 View로 업스트림을 올리게 됩니다.
        this.repository.fetchMovies(pageNum)
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<List<Movie>>() {
                    @Override
                    public void accept(List<Movie> movies) throws Exception {
                        Log.d("MainPresenter", "movies : " + movies.size());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.d("MainPresenter", throwable.getMessage());
                    }
                });
    }
}
