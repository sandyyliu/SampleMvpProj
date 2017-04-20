package com.tencent.samplemvp.model.impl;

import com.tencent.samplemvp.model.ILoginModel;

/**
 * Created by ly on 17/4/19.
 */

public class LoginModel implements ILoginModel {

    private String name;
    private String pass;

    public LoginModel(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    @Override
    public String getUserName() {
        return name;
    }

    @Override
    public String getUserPass() {
        return pass;
    }

    @Override
    public boolean checkUserValidity(String name, String pass) {
        if (name == null || pass == null || !name.equals(getUserName()) || !pass.equals(getUserPass())) {
            return false;
        }
        return true;
    }
}
