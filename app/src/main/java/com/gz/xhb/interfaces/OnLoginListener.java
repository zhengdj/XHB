package com.gz.xhb.interfaces;

import com.gz.xhb.Entity.User;

/**
 * Created by zdj on 2018/5/21.
 */

public interface OnLoginListener {
    void loginSuccess(User user);
    void loginFailed();
}
