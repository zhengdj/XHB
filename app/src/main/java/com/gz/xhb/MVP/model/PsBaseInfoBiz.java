package com.gz.xhb.MVP.Model;

import com.gz.xhb.MVP.Model.Entity.PsBaseInfo;
import com.gz.xhb.MVP.Interfaces.IPsBaseInfoBiz;
import com.gz.xhb.MVP.Interfaces.OnGetPsBaseInfoListener;

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
