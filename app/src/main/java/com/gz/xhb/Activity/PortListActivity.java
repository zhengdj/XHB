package com.gz.xhb.Activity;

import android.widget.ListView;

import com.gz.xhb.Adapter.PortListAdatper;
import com.gz.xhb.Base.BaseListActivity;
import com.gz.xhb.Entity.PortInfo;
import com.gz.xhb.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zdj on 2018/6/12.
 */

public class PortListActivity extends BaseListActivity<ListView,PortListAdatper> {
    @Override
    public String setTitle() {
        return "排口列表";
    }

    @Override
    public ListView setListView() {
        return findViewById(R.id.lv_baseList);
    }

    @Override
    public PortListAdatper setAdapter() {
        return getTestAdapter();
    }

    private PortListAdatper getTestAdapter() {
        PortInfo portInfo = new PortInfo();
        List<PortInfo> list = new ArrayList<>();
        for(int i=0;i<30;i++){
            portInfo.setOutputcode("测试"+i);
            list.add(portInfo);
        }
       return new PortListAdatper(this,list);
    }
}
