package com.gz.xhb.Base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gz.xhb.Activity.XHBBaseActivity;
import com.gz.xhb.R;
import com.gz.xhb.util.ToolBarUtil;

import java.util.List;

/**
 * Created by zdj on 2018/6/12.
 */

public abstract class BaseListActivity<LV extends ListView, A extends XHBBaseAdapter> extends XHBBaseActivity implements AdapterView.OnItemClickListener{
    LV listView;
//    List<T> mList = new ArrayList<>();
    A adapter;



    @SuppressLint("WrongViewCast")
    @Override
    protected void initView(Bundle savedInstanceState) {
        ToolBarUtil.setToolBar(this,setTitle());
        listView = setListView();
        adapter = setAdapter();
        listView.setAdapter(adapter);
        loadDataSync();
        listView.setOnItemClickListener(this);
    }
    public abstract String setTitle();
    public abstract LV setListView();
    public abstract A setAdapter();

    public abstract void loadDataSync();

    protected  void onLoadSuccess(List list){
        adapter.onDateChange(list);
    }



}
