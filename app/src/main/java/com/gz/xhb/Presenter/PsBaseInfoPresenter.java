package com.gz.xhb.Presenter;

import android.os.Handler;

import com.gz.xhb.Entity.PsBaseInfo;
import com.gz.xhb.Entity.User;
import com.gz.xhb.interfaces.OnGetPsBaseInfoListener;
import com.gz.xhb.interfaces.OnLoginListener;
import com.gz.xhb.model.PsBaseInfoBiz;
import com.gz.xhb.model.UserBiz;
import com.gz.xhb.view.PsBaseInfoView;
import com.gz.xhb.view.LoginView;

/**
 * Created by zdj on 2018/5/21.
 */

public class PsBaseInfoPresenter {
    PsBaseInfoView psBaseInfoView;
    PsBaseInfoBiz biz;

    public PsBaseInfoPresenter(PsBaseInfoView psBaseInfoView) {
        this.psBaseInfoView = psBaseInfoView;
        biz = new PsBaseInfoBiz();
    }

    public void getPsBaseInfo(){
        psBaseInfoView.showProgressDialog();
        biz.getPsBaseInfo("", new OnGetPsBaseInfoListener() {

            @Override
            public void onGetSuccess(PsBaseInfo psBaseInfo) {
                psBaseInfoView.showPsBaseInfo(psBaseInfo);
            }

            @Override
            public void onGetFailed() {

            }
        });
    }


//    @Module
//    public class MainModule {
//        private final LoginView mView;
//
//        public MainModule(LoginView view) {
//            mView = view;
//        }
//
//        @Provides
//        LoginView provideMainView() {
//            return mView;
//        }
//    }



//    @Component()
//    public interface LoginComponent {
//        void inject(LoginActivity activity);
//    }
}
