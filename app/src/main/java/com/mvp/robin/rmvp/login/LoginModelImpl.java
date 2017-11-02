package com.mvp.robin.rmvp.login;

import android.os.Handler;

/**
 * Created by Robin on 2017/10/29.
 */

public class LoginModelImpl implements ILoginModel {
    private LoginPresenterImpl presenter;

    public LoginModelImpl(LoginPresenterImpl presenter) {
        this.presenter = presenter;
    }

    private Handler mHandler = new Handler();
    @Override
    public void login(String name, String pass) {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                presenter.loginSucceed();
            }
        },3000);
    }
}
