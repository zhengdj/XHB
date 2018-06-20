package com.gz.xhb.Activity;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.gz.xhb.Entity.PsBaseInfo;
import com.gz.xhb.MVP.Presenter.PsBaseInfoPresenter;
import com.gz.xhb.R;
import com.gz.xhb.databinding.ActivityPsBaseInfoBinding;
import com.gz.xhb.util.ToolBarUtil;
import com.gz.xhb.MVP.view.PsBaseInfoView;

/**
 * Created by zdj on 2018/6/6.
 */

public class PsBaseInfoActivity extends XHBBaseActivity implements PsBaseInfoView {

    PsBaseInfo psBaseInfo = new PsBaseInfo();
    ActivityPsBaseInfoBinding binding;
    PsBaseInfoPresenter psBaseInfoPresenter = new PsBaseInfoPresenter(this);

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_ps_base_info;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        ToolBarUtil.setToolBar(this,"企业基本信息");
        binding = DataBindingUtil.bind(getBindingLayout());
        binding.setPsmPsBaseInfo(psBaseInfo);
        psBaseInfoPresenter.getPsBaseInfo();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_ps_base_info, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_psBaseInfo_portInfo:
                Intent intent = new Intent(this, TestActivity.class);
                startActivityForResult(intent,2);
                return true;

            case R.id.action_psBaseInfo_equipment:
                intent = new Intent(this, TestActivity.class);
                startActivityForResult(intent,2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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
    public void showPsBaseInfo(PsBaseInfo psBaseInfo) {
        this.psBaseInfo = psBaseInfo;
        binding.setPsmPsBaseInfo(this.psBaseInfo);
    }
}
