package com.gz.xhb.MVP.Model.Entity;

import java.io.Serializable;

/**
 * Created by zdj on 2018/6/6.
 */

public class PortInfo implements Serializable {
    private String outputcode;//编号
    private String  outputname;//名称
    private String mn;
    private String  outputtype;//类型
    private String  outputpointtype;//位置类型
    private String  ifsintering;//是否烧结

    public String getOutputcode() {
        return outputcode;
    }

    public void setOutputcode(String outputcode) {
        this.outputcode = outputcode;
    }

    public String getOutputname() {
        return outputname;
    }

    public void setOutputname(String outputname) {
        this.outputname = outputname;
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        this.mn = mn;
    }

    public String getOutputtype() {
        return outputtype;
    }

    public void setOutputtype(String outputtype) {
        this.outputtype = outputtype;
    }

    public String getOutputpointtype() {
        return outputpointtype;
    }

    public void setOutputpointtype(String outputpointtype) {
        this.outputpointtype = outputpointtype;
    }

    public String getIfsintering() {
        return ifsintering;
    }

    public void setIfsintering(String ifsintering) {
        this.ifsintering = ifsintering;
    }
}
