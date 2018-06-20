package com.gz.xhb.MVP.Model.API.cache;


/**
 * Created by QingMei on 2017/7/10.
 * desc:
 */

public interface IXHBCacheProviders {

    /**
     * LifeCache设置缓存过期时间. 如果没有设置@LifeCache , 数据将被永久缓存理除非你使用了 EvictProvider,EvictDynamicKey or EvictDynamicKeyGroup .
     * @param user
     * @param userName 驱逐与一个特定的键使用EvictDynamicKey相关的数据。比如分页，排序或筛选要求
     * @param evictDynamicKey   可以明确地清理指定的数据 DynamicKey.
     * @return
     */
//    @LifeCache(duration = 1,timeUnit = TimeUnit.MINUTES)
//    Observable<BaseArrayVO<PsBasicList>> getPsList(Observable<BaseArrayVO<PsBasicList>> psList, DynamicKey keyAndNumber, EvictDynamicKey evictDynamicKey);
//
//    @LifeCache(duration = 1,timeUnit = TimeUnit.MINUTES)
//    Observable<BaseArrayVO<NearPsList>> getNearPsList(Observable<BaseArrayVO<NearPsList>> psList, DynamicKey keyAndNumber, EvictDynamicKey evictDynamicKey);


}
