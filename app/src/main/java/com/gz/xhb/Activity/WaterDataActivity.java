package com.gz.xhb.Activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gz.xhb.Adapter.WaterDataAdapter;
import com.gz.xhb.Base.BaseOnlineDataActivity;
import com.gz.xhb.Base.XHBBaseAdapter;
import com.gz.xhb.MVP.Entity.OnlineDataInfo;
import com.gz.xhb.MVP.Entity.WaterDataInfo;
import com.gz.xhb.R;
import com.gz.xhb.util.UIUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zdj on 2018/6/13.
 */

public class WaterDataActivity extends BaseOnlineDataActivity<WaterDataInfo> {
    List<OnlineDataInfo<WaterDataInfo>> list = new ArrayList<>();

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_data;
    }


    @Override
    public String setTitle() {
        return "水监控点";
    }

    @Override
    public ListView setListView() {
        return findViewById(R.id.lv_baseList);
    }

    @Override
    public XHBBaseAdapter setAdapter() {
        return new WaterDataAdapter(this,list);
    }

    @Override
    public void loadDataSync() {
        if(list == null||list.size()==0){
            list.add(initTitle());
        }
        for(int i=0;i<30;i++){
            WaterDataInfo waterDataInfo = new WaterDataInfo();
            waterDataInfo.setTest1("2017-6-13 16:37:5"+i);
            waterDataInfo.setTest2(30+i+"");
            waterDataInfo.setTest3(20+i+"");
            waterDataInfo.setTest4(10+i+"");
            OnlineDataInfo<WaterDataInfo> onlineDataInfo = new OnlineDataInfo<>();
            onlineDataInfo.setT(waterDataInfo);
            if(i%2==0){
                onlineDataInfo.setColor(getResources().getColor(R.color.colorAccent));
            }else {
                onlineDataInfo.setColor(getResources().getColor(R.color.backgroud_color));
            }
            onlineDataInfo.setHeight(-1);
            list.add(onlineDataInfo);
        }
    }

    private OnlineDataInfo<WaterDataInfo> initTitle() {
        WaterDataInfo waterDataInfo = new WaterDataInfo();
        waterDataInfo.setTest1("时间");
        waterDataInfo.setTest2("COD");
        waterDataInfo.setTest3("氨氮");
        waterDataInfo.setTest4("流量");
        OnlineDataInfo<WaterDataInfo> onlineDataInfo = new OnlineDataInfo<>();
        onlineDataInfo.setT(waterDataInfo);
        onlineDataInfo.setColor(getResources().getColor(R.color.colorPrimaryDark));
        onlineDataInfo.setHeight(UIUtil.dp2px(this,50));
        return onlineDataInfo;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
