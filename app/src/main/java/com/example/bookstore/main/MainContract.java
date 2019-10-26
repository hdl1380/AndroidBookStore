package com.example.bookstore.main;

import com.example.bookstore.base.BasePresenter;
import com.example.bookstore.base.BaseView;
import com.example.bookstore.model.Movie;

import java.util.List;

public class MainContract {
    public interface View extends BaseView {
        // 책 리스트 조회한 걸 뷰에 다시 올려야 함
        void fetchBooksDone(List<Movie> list);
    }

    public interface Presenter extends BasePresenter<View> {
        // 책 리스트 요청
        void fetchBooks(int pageNum);
    }
}
