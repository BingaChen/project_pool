package com.cqf.project_pool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cqf.fenglib.base.BaseActivity;
import com.cqf.fenglib.base.BaseToolbarActivity;
import com.cqf.fenglib.utils.MyUtils;

public class MainActivity extends BaseToolbarActivity {

    TextView tvClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initView() {
//        setTitle("主页面");
        tvClick=findViewById(R.id.tvClick);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {
        tvClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyUtils.showToast(context,"click!");
            }
        });
    }

}
