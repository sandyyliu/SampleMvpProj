package com.tencent.samplemvp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.tencent.samplemvp.base.BaseActivity;
import com.tencent.samplemvp.presenter.impl.LoginPresenter;
import com.tencent.samplemvp.view.ILoginView;

public class MainActivity extends BaseActivity<ILoginView, LoginPresenter> implements ILoginView {

    private ProgressBar progressBar;
    private EditText nameET;
    private EditText passET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        nameET = (EditText) findViewById(R.id.name);
        passET = (EditText) findViewById(R.id.pass);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void onLoginClick(View view) {
        //TODO
        presenter.doLogin("mvp", "mvp");
    }

    @Override
    public LoginPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onLoginResult(boolean res) {
        if (res) {
            Toast.makeText(getApplicationContext(), "登陆成功", Toast.LENGTH_LONG).show();
            presenter.clearText();
        } else {
            Toast.makeText(getApplicationContext(), "登陆失败", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClearText() {
        nameET.setText("");
        passET.setText("");
    }
}
