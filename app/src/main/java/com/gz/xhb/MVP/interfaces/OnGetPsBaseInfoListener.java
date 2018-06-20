package com.gz.xhb.MVP.interfaces;

import com.gz.xhb.Entity.PsBaseInfo;

/**
 * Created by zdj on 2018/5/21.
 */

public interface OnGetPsBaseInfoListener {
    void onGetSuccess(PsBaseInfo psBaseInfo);
    void onGetFailed();
}
