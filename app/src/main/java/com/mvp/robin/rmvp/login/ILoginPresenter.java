package com.mvp.robin.rmvp.login;

/**
 * Created by Robin on 2017/10/29.
 */

public interface ILoginPresenter {
    void loginToServer(String name, String pass);

    void loginSucceed();
}
