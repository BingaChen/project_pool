package com.cqf.project_pool.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cqf.fenglib.base.BaseActivity;
import com.cqf.project_pool.R;
import com.cqf.project_pool.adapter.ContentsAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    ContentsAdapter contentsAdapter;
    List<String> mainList = new ArrayList<>();

    @BindView(R.id.RvMain)
    RecyclerView RvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initView() {
        contentsAdapter = new ContentsAdapter(mainList);
        contentsAdapter.bindRecyclerView(RvMain);
    }

    @Override
    public void initData() {
        mainList.add("AlertDialog");

        contentsAdapter.notifyDataSetChanged();
    }

    @Override
    public void initListener() {
        contentsAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Class<?> intentClass = null;
                switch (position) {
                    case 0:
                        intentClass = AlertDialogActivity.class;
                        break;
                    case 1:
                        break;
                }
                if (intentClass != null) {
                    startActivity(new Intent(context, intentClass));
                }
            }
        });
    }

}
