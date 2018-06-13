package com.gz.xhb.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toolbar;

import com.gz.xhb.Presenter.MainMenuPresenter;
import com.gz.xhb.R;
import com.gz.xhb.util.ToolBarUtil;
import com.gz.xhb.view.MainMenuView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;

/**
 * Created by zdj on 2018/6/5.
 */

public class MainMenuActivity extends XHBBaseActivity implements MainMenuView{
    @BindView(R.id.MyGridView)
    GridView mGridView;

    //定义图标数组
    private int[] imageRes = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    //定义标题数组
    private String[] itemName = {"电子地图", "基础信息", "污水数据", "废气数据", "VOCs数据", "报警数据", "预警数据"};

    private Class[] classes = {AMapActivity.class
            ,PsBaseInfoActivity.class
            ,PsListActivity.class
            ,PsListActivity.class
            ,PsListActivity.class,
            PsListActivity.class,
            PsBaseInfoActivity.class,};

    private List<HashMap<String, Object>> data = new ArrayList<>();

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    MainMenuPresenter mainMenuPresenter = new MainMenuPresenter();


    @Override
    protected void initView(Bundle savedInstanceState) {
        ToolBarUtil.setToolBar(this,"环保在线");
        ToolBarUtil.getToolBar(this).setNavigationIcon(null);
        int length = itemName.length;
        for (int i = 0; i < length; i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("ItemImageView", imageRes[i]);
            map.put("ItemTextView", itemName[i]);
            data.add(map);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,
                data, R.layout.main_menu_item, new String[]{"ItemImageView", "ItemTextView"},
                new int[]{R.id.ItemImageView, R.id.ItemTextView});
        mGridView.setAdapter(simpleAdapter);

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                toActivity(position);
            }
        });
    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void dismissProgressDialog() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showSuccess() {

    }


    @Override
    public void toActivity(int position) {
        Intent intent = new Intent(this,classes[position]);
//        intent.putExtra("user",user);
        startActivity(intent);
    }
}
