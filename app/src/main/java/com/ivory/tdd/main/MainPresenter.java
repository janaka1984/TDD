package com.ivory.tdd.main;

public class MainPresenter implements  MainContract.Presenter {

    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view){
        mView = view;
    }

    @Override
    public void handleSignInButtonClick() {
        mView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick() {
        mView.showSignUpScreen();
    }
}
