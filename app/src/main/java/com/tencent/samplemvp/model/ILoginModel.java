package com.tencent.samplemvp.model;

/**
 * Created by ly on 17/4/19.
 */

public interface ILoginModel {
    String getUserName();
    String getUserPass();
    boolean checkUserValidity(String name, String pass);
}
