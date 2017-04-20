package com.tencent.samplemvp.presenter.impl;

import android.os.Handler;
import android.os.Looper;

import com.tencent.samplemvp.base.BasePresenter;
import com.tencent.samplemvp.model.impl.LoginModel;
import com.tencent.samplemvp.presenter.ILoginPresenter;
import com.tencent.samplemvp.view.ILoginView;

/**
 * Created by ly on 17/4/19.
 */

public class LoginPresenter extends BasePresenter<ILoginView> implements ILoginPresenter {

    private LoginModel loginModel;

    private Handler mHandler;

    public LoginPresenter() {
        initLoginUser();
        mHandler = new Handler(Looper.getMainLooper());
    }

    @Override
    public boolean doLogin(String name, String pass) {
        mView.showLoading();
        final boolean result = loginModel.checkUserValidity(name, pass);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mView.hideLoading();
                mView.onLoginResult(result);
            }
        }, 5000);
        return false;
    }

    @Override
    public void clearText() {
        mView.onClearText();
    }

    private void initLoginUser() {
        loginModel = new LoginModel("mvp", "mvp");
    }
}
