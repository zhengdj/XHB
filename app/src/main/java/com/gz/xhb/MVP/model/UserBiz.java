package com.gz.xhb.MVP.model;

import com.gz.xhb.MVP.Entity.User;
import com.gz.xhb.MVP.interfaces.IUserBiz;
import com.gz.xhb.MVP.interfaces.OnLoginListener;

/**
 * Created by zdj on 2018/5/21.
 */

public class UserBiz implements IUserBiz {
    @Override
    public void login(final String username, final String password, final OnLoginListener loginListener) {



        //模拟子线程耗时操作
        new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                //模拟登录成功
//                if ("zhy".equals(username) && "123".equals(password))
                if (true)
                {
                    User user = new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    loginListener.loginSuccess(user);
                } else
                {
                    loginListener.loginFailed();
                }
            }
        }.start();
    }
}
