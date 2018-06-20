package com.gz.xhb.MVP.interfaces;

import com.gz.xhb.MVP.Entity.User;

/**
 * Created by zdj on 2018/5/21.
 */

public interface OnLoginListener {
    void loginSuccess(User user);
    void loginFailed();
}
