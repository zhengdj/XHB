package com.gz.xhb.interfaces;


import com.gz.xhb.interfaces.OnLoginListener;

/**
 * Created by zdj on 2018/5/21.
 */

public interface IUserBiz {
    void login(String username, String password, OnLoginListener loginListener);
}
