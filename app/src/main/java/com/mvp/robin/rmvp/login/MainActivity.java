package com.mvp.robin.rmvp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mvp.robin.rmvp.R;

public class MainActivity extends AppCompatActivity implements ILoginView{
    private ProgressBar mProgressBar;
private LoginPresenterImpl presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressBar = findViewById(R.id.progress);
        presenter = new LoginPresenterImpl(this);
        
    }
    @Override
    public void showProgress(boolean enable) {
        if(enable){
            mProgressBar.setVisibility(View.VISIBLE);
        }else{
            mProgressBar.setVisibility(View.GONE);
        }
    }

    @Override
    public void showLoginView() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_LONG).show();
    }

    public void onClickLogin(View view) {
        presenter.loginToServer("robin","123456");
    }
}
