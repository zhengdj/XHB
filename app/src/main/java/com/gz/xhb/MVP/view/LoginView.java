package com.gz.xhb.MVP.View;

import com.gz.xhb.MVP.Model.Entity.User;

/**
 * Created by zdj on 2018/5/21.
 */

public interface LoginView extends BaseView{
    String getUser();
    String getPassword();
    void clearUserInfo();
    void toMainActivity(User user);

}
