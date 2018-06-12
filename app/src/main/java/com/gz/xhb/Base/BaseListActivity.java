package com.gz.xhb.Base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.gz.xhb.Activity.XHBBaseActivity;
import com.gz.xhb.R;
import com.gz.xhb.util.ToolBarUtil;

/**
 * Created by zdj on 2018/6/12.
 */

public abstract class BaseListActivity<LV extends ListView, A extends ListAdapter> extends XHBBaseActivity {
    LV listView;
//    List<T> mList = new ArrayList<>();
    A adapter;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_list;
    }

    @SuppressLint("WrongViewCast")
    @Override
    protected void initView(Bundle savedInstanceState) {
        ToolBarUtil.setToolBar(this,setTitle());
        listView = setListView();
        listView.setAdapter(setAdapter());
    }
    public abstract String setTitle();
    public abstract LV setListView();
    public abstract A setAdapter();
}
