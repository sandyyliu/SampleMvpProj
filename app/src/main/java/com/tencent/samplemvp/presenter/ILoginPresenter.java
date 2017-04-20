package com.tencent.samplemvp.presenter;

/**
 * Created by ly on 17/4/19.
 */

public interface ILoginPresenter {
    boolean doLogin(String username, String password);
    void clearText();
}
