package com.gz.xhb.interfaces;

import com.gz.xhb.Entity.PsBaseInfo;
import com.gz.xhb.Entity.User;

/**
 * Created by zdj on 2018/5/21.
 */

public interface OnGetPsBaseInfoListener {
    void onGetSuccess(PsBaseInfo psBaseInfo);
    void onGetFailed();
}
