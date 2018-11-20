package com.example.elad.test.screens.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.elad.test.R;
import com.example.elad.test.constant.Constants;
import com.example.elad.test.screens.base.BaseActivity;
import com.example.elad.test.screens.main.MainActivity;
import com.example.elad.test.screens.splash.contracts.SplashContract;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashContract.View {

    @Inject
    SplashContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        presenter.onAttach(this);
        startTimer();
    }

    private void startTimer() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },Constants.TIMER_IN_SECONDS);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDetach();
    }
}
