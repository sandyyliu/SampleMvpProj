package com.tencent.samplemvp.base;

/**
 * Created by ly on 17/4/19.
 * 如果每一个Activity都需要做绑定和解绑操作就太麻烦了，希望可以有一个通用的presenter来为我们添加view的绑定与销毁。
 */

public abstract class BasePresenter<T> {
    //因为不能限定死传入的View，所以使用泛型来代替传入的对象。
    public T mView;

    public void attach(T mView) {
        this.mView = mView;
    }

    public void detach() {
        this.mView = null;
    }
}
