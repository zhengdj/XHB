package com.gz.xhb.MVP.Presenter;

import android.os.Handler;

import com.gz.xhb.MVP.interfaces.OnLoginListener;
import com.gz.xhb.MVP.view.LoginView;
import com.gz.xhb.MVP.Entity.User;
import com.gz.xhb.MVP.model.UserBiz;

/**
 * Created by zdj on 2018/5/21.
 */

public class UserLoginPresenter {
    LoginView loginView;
    UserBiz biz;
    private Handler mHandler = new Handler();

//    @Inject
    public UserLoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        biz = new UserBiz();
    }

    public void login(){
        loginView.showProgressDialog();
        biz.login(loginView.getUser(), loginView.getPassword(), new OnLoginListener() {
            @Override
            public void loginSuccess(final User user) {
                //需要在UI线程执行
                mHandler.post(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        loginView.toMainActivity(user);
                        loginView.dismissProgressDialog();
                    }
                });
            }

            @Override
            public void loginFailed() {

                //需要在UI线程执行
                mHandler.post(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        loginView.showError();
                        loginView.dismissProgressDialog();
                    }
                });
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
