package com.gz.xhb.MVP.Entity;

import java.util.List;

/**
 * Created by dell on 2018/5/15.
 */

public class BaseArrayVO<T> {
    private boolean success;
    private String flag;
    private String msg;
    private List<T> data;

    public BaseArrayVO(List<T> data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

