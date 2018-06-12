package com.gz.xhb.Entity;

import java.io.Serializable;

/**
 * Created by zdj on 2018/5/21.
 *
 */

public class User implements Serializable{
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
