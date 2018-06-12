package zuo.biao.library.base;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.view.View;

import zuo.biao.library.interfaces.ActivityPresenter;

/**
 * Created by zdj on 2018/5/25.
 */

public abstract class Test extends Activity implements ActivityPresenter {
    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public void onReturnClick(View v) {

    }

    @Override
    public void onForwardClick(View v) {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {

    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
