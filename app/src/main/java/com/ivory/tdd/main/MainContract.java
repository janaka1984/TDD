package com.ivory.tdd.main;

public interface MainContract {

    interface MvpView{
        void showSignInScreen();
        void  showSignUpScreen();
    }

    interface Presenter{
        void handleSignInButtonClick();
        void handleSignUpButtonClick();
    }
}
