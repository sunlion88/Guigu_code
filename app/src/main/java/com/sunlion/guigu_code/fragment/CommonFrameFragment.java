package com.sunlion.guigu_code.fragment;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.sunlion.guigu_code.R;
import com.sunlion.guigu_code.adapter.CommonFrameFragmentAdapter;
import com.sunlion.guigu_code.base.BaseFragment;

/**
 * Created by Administrator on 2016/11/15 0015.
 */

public class CommonFrameFragment extends BaseFragment {

    private ListView mListeview;

    private String[] datas;

    private CommonFrameFragmentAdapter adapter;

    private static final String TAG = CommonFrameFragment.class.getSimpleName();

    @Override
    protected View initView() {
        Log.e(TAG,"常用框架Fragment页面被初始化了...");
        View view = View.inflate(mContext, R.layout.fragment_common_frame,null);
        mListeview = (ListView)view.findViewById(R.id.list_view);
        mListeview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = datas[position];
                Toast.makeText(mContext,"data=="+data,Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    protected void initData() {
        super.initData();
        Log.e(TAG,"常用框架Fragment数据被初始化了...");
        //准备数据
        datas = new String[]{"OKHttp", "xUtils3","Retrofit2","Fresco","Glide","greenDao","RxJava","volley","Gson",
                "FastJson","picasso","evenBus","jcvideoplayer","pulltorefresh","Expandablelistview","UniversalVideoView","....."};
        //设置适配器
        adapter = new CommonFrameFragmentAdapter(mContext,datas);
        mListeview.setAdapter(adapter);
    }
}
