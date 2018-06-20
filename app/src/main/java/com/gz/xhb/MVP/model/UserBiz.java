package com.gz.xhb.MVP.Model;

import com.gz.xhb.MVP.Interfaces.IUserBiz;
import com.gz.xhb.MVP.Interfaces.OnLoginListener;
import com.gz.xhb.MVP.Model.Entity.User;

/**
 * Created by zdj on 2018/5/21.
 */

public class UserBiz implements IUserBiz {
    @Override
    public void login(final String username, final String password, final OnLoginListener loginListener) {


//        io.reactivex.Observable<ResponseBody> login = new ServiceManager().login("18032033357","123456","outerApp");
//
//        login.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<ResponseBody>() {
//
//                    @Override
//                    public void onSubscribe(Disposable disposable) {
//
//                    }
//
//                    @Override
//                    public void onNext(ResponseBody responseBody) {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable throwable) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });

        //模拟子线程耗时操作
        new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                //模拟登录成功
//                if ("zhy".equals(username) && "123".equals(password))
                if (true)
                {
                    User user = new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    loginListener.loginSuccess(user);
                } else
                {
                    loginListener.loginFailed();
                }
            }
        }.start();
    }
}
