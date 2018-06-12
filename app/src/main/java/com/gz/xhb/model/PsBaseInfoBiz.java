package com.gz.xhb.model;

import com.gz.xhb.Entity.PsBaseInfo;
import com.gz.xhb.interfaces.IMainMenuBiz;
import com.gz.xhb.interfaces.IPsBaseInfoBiz;
import com.gz.xhb.interfaces.OnGetPsBaseInfoListener;

/**
 * Created by zdj on 2018/6/6.
 */

public class PsBaseInfoBiz implements IPsBaseInfoBiz{
    @Override
    public void getPsBaseInfo(String id, OnGetPsBaseInfoListener onGetPsBaseInfoListener) {
        PsBaseInfo psBaseInfo = new PsBaseInfo();
        psBaseInfo.setPsname("测试");
        onGetPsBaseInfoListener.onGetSuccess(psBaseInfo);
    }
}
