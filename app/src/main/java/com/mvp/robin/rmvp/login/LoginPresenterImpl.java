package com.mvp.robin.rmvp.login;

/**
 * Created by Robin on 2017/10/29.
 */

public class LoginPresenterImpl implements ILoginPresenter {
    private ILoginModel loginModel;
    private ILoginView loginView;

    public LoginPresenterImpl(ILoginView loginView) {
        this.loginView = loginView;
        this.loginModel = new LoginModelImpl(this);
    }

    @Override
    public void loginToServer(String name, String pass) {
        loginView.showProgress(true);
        loginModel.login(name,pass);
    }

    @Override
    public void loginSucceed() {
        loginView.showProgress(false);
        loginView.showLoginView();
    }
}
