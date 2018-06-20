package com.gz.xhb.Activity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gz.xhb.Adapter.PortListAdatper;
import com.gz.xhb.Base.BaseListActivity;
import com.gz.xhb.MVP.Model.Entity.PortInfo;
import com.gz.xhb.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zdj on 2018/6/12.
 */

public class PortListActivity extends BaseListActivity<ListView, PortListAdatper> {
    List<PortInfo> list = new ArrayList<>();


    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_list;
    }

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

    @Override
    public void loadDataSync() {
        for (int i = 0; i < 30; i++) {
            PortInfo portInfo = new PortInfo();
            portInfo.setOutputcode("code" + i);
            portInfo.setOutputname("name" + i);
            portInfo.setMn("mn" + i);
            portInfo.setOutputpointtype("outputpointtype" + i);
            portInfo.setOutputtype("outputtype" + i);
            portInfo.setIfsintering("sintering" + i);
            list.add(portInfo);
        }
        onLoadSuccess(list);
    }

    private PortListAdatper getTestAdapter() {

        return new PortListAdatper(this, list);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        startActivity(new Intent(this,WaterDataActivity.class));
    }
}
