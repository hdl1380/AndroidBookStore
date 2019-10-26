package com.example.bookstore.main;

import com.example.bookstore.base.BasePresenterImpl;

public class MainPresenter extends BasePresenterImpl<MainContract.View>
    implements MainContract.Presenter
{
    @Override
    public void fetchMovies(int pageNum) {
        //TODO Repository 에 데이터를 가져오도록 명령
        //TODO RxJava 로 View로 업스트림을 올리게 됩니다. 
    }
}
