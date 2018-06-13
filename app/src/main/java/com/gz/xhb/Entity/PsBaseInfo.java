package com.gz.xhb.Entity;

import java.io.Serializable;

/**
 * Created by zdj on 2018/6/6.
 */

public class PsBaseInfo implements Serializable {
    private String pscode;
    private String  psname;
    private String attentiondegreename;
    private String  pstypename;
    private String  psaddress;
    private String  regionname;
    private String  orgnizationcode;
    private String  corporate;
    private String  longitude;
    private String  latitude;
    private String  linkMan;
    private String  mobile;
    private String  remarks;

    public String getPscode() {
        return pscode;
    }

    public void setPscode(String pscode) {
        this.pscode = pscode;
    }

    public String getPsname() {
        return psname;
    }

    public void setPsname(String psname) {
        this.psname = psname;
    }

    public String getAttentiondegreename() {
        return attentiondegreename;
    }

    public void setAttentiondegreename(String attentiondegreename) {
        this.attentiondegreename = attentiondegreename;
    }

    public String getPstypename() {
        return pstypename;
    }

    public void setPstypename(String pstypename) {
        this.pstypename = pstypename;
    }

    public String getPsaddress() {
        return psaddress;
    }

    public void setPsaddress(String psaddress) {
        this.psaddress = psaddress;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    public String getOrgnizationcode() {
        return orgnizationcode;
    }

    public void setOrgnizationcode(String orgnizationcode) {
        this.orgnizationcode = orgnizationcode;
    }

    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
