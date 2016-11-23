package com.sunlion.guigu_code.fragment;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.sunlion.guigu_code.base.BaseFragment;

/**
 * Created by Administrator on 2016/11/15 0015.
 */

public class CustomFragment extends BaseFragment {

    private static final String TAG = CustomFragment.class.getSimpleName();
    private TextView textView;

    @Override
    protected View initView() {
        Log.e(TAG,"自定义Fragment页面被初始化了...");
        textView = new TextView(mContext);
        textView.setTextSize(20);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        return textView;
    }

    @Override
    protected void initData() {
        super.initData();
        Log.e(TAG, "自定义Fragment数据被初始化了...");
        textView.setText("自定义页面");
    }
}
