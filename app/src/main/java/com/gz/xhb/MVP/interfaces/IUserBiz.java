package com.gz.xhb.MVP.interfaces;


/**
 * Created by zdj on 2018/5/21.
 */

public interface IUserBiz {
    void login(String username, String password, OnLoginListener loginListener);
}
