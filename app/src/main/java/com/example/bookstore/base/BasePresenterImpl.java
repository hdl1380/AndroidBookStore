package com.example.bookstore.base;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenterImpl<T extends BaseView> implements BasePresenter<T> {
    protected T view;
    protected CompositeDisposable bag = new CompositeDisposable();

    @Override
    public void setView(T view) {
        this.view = view;
    }

    @Override
    public void removeView() {
        this.view = null;
        bag.clear();
    }
}
