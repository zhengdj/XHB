package com.gz.xhb.MVP.Model.Entity;

import java.io.Serializable;

/**
 * Created by zdj on 2018/6/13.
 */

public class OnlineDataInfo<T> implements Serializable {

    int color;
    int height;
    T t;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
