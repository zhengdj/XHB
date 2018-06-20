package com.gz.xhb.MVP.Interfaces;

import com.gz.xhb.MVP.Model.Entity.PsBaseInfo;

/**
 * Created by zdj on 2018/5/21.
 */

public interface OnGetPsBaseInfoListener {
    void onGetSuccess(PsBaseInfo psBaseInfo);
    void onGetFailed();
}
