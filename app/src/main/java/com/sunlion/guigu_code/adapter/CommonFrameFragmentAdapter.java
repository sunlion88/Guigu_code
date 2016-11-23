package com.sunlion.guigu_code.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/11/15 0015.
 */

public class CommonFrameFragmentAdapter extends BaseAdapter {

    private final Context mContext;
    private final String[] mData;

    public CommonFrameFragmentAdapter(Context mContext, String[] mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(mContext);
        textView.setPadding(10,10,10,10);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(20);
        textView.setText(mData[position]);
        return textView;
    }
}
