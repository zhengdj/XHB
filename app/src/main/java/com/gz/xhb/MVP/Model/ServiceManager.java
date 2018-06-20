package com.gz.xhb.MVP.Model;

import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import com.gz.xhb.Application.MyApplication;
import com.gz.xhb.MVP.Model.API.service.ServerInterface;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by QingMei on 2017/6/23.
 * desc:
 */

public class ServiceManager {

    private static ServerInterface service;

    public ServiceManager() {
        init();
    }

    private void init() {
        if(service==null){
            //        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor()
//                .setLevel(HttpLoggingInterceptor.Level.BODY);
            ClearableCookieJar cookieJar =
                    new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(MyApplication.getContext()));

            OkHttpClient client = new OkHttpClient()
                    .newBuilder()
                    .cookieJar(cookieJar)
//                .addInterceptor(interceptor)
                    .build();

            service = new Retrofit.Builder()
//                .baseUrl("http://222.223.212.195:8007/public/")
                    .baseUrl("http://121.28.81.11:8017/smartui/operate/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(client)
                    .build()
                    .create(ServerInterface.class);
        }

    }

//    public Observable<BaseVO<SysUserInfo>> getUser(String serverId, RequestBody body){
//        return service.getUsersInfo(serverId,body);
//    }
//    public Observable<BaseArrayVO<PsBasicList>> getPsList(String serverId, RequestBody body){
//        return service.getPsList(serverId,body);
//    }
//    public Observable<ResponseBody> login(String user, String pw, String str){
//        return service.Login(user,pw,str);
//    }
//
//    public Observable<BaseArrayVO<NearPsList>> getNearPsList(RequestBody body){
//        return service.getNearPsList(body);
//    }
}
