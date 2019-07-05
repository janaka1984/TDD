package com.ivory.tdd.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ivory.tdd.R;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
    }

    @Override
    public void showSignInScreen() {
        Toast.makeText(this,"Sign In", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this,"Sign Up", Toast.LENGTH_LONG).show();
    }
}
