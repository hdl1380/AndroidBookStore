package com.example.bookstore.base;

public interface BasePresenter<T> {
    void setView(T view);
    void removeView();
}
