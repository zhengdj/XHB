package com.gz.xhb.MVP.Model.API.cache;

import com.gz.xhb.Application.MyApplication;

import io.rx_cache2.internal.RxCache;
import io.victoralbertos.jolyglot.GsonSpeaker;

/**
 * Created by QingMei on 2017/7/10.
 * desc:
 */

public class CacheProviders {

    private static IXHBCacheProviders psCacheProviders;

    public synchronized static IXHBCacheProviders getPsListCache() {
        if (psCacheProviders == null) {
            psCacheProviders = new RxCache.Builder()
                    .persistence(MyApplication.getContext().getExternalCacheDir(), new GsonSpeaker())
                    .using(IXHBCacheProviders.class);
        }
        return psCacheProviders;
    }
}
