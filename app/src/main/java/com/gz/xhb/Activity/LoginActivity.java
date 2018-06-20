package com.gz.xhb.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.gz.xhb.MVP.Presenter.UserLoginPresenter;
import com.gz.xhb.R;
import com.gz.xhb.MVP.Model.Entity.User;
import com.gz.xhb.MVP.View.LoginView;


import butterknife.BindView;

public class LoginActivity extends XHBBaseActivity implements LoginView {

    @BindView(R.id.et_login_id)
    EditText et_user;
    @BindView(R.id.et_login_password)
    EditText et_password;
    @BindView(R.id.bt_login_login)
    Button button;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;

//    @Inject
    UserLoginPresenter userLoginPresenter = new UserLoginPresenter(this);

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_login1;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        progressBar.setVisibility(View.GONE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLoginPresenter.login();
            }
        });
    }

    @Override
    public String getUser() {
        return et_user.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return et_password.getText().toString().trim();
    }

    @Override
    public void clearUserInfo() {
        et_user.setText("");
        et_password.setText("");
    }

    @Override
    public void showProgressDialog() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissProgressDialog() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void toMainActivity(User user) {
        Intent intent = new Intent(this,MainMenuActivity.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }

    @Override
    public void showError() {
        Toast.makeText(this,"错误！",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSuccess() {
        Toast.makeText(this,"成功！",Toast.LENGTH_SHORT).show();

    }




}
