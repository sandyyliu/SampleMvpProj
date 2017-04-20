package com.tencent.samplemvp.view;

import com.tencent.samplemvp.base.BaseView;

/**
 * Created by ly on 17/4/19.
 */

public interface ILoginView extends BaseView {
    void onLoginResult(boolean res);
    void onClearText();
}
