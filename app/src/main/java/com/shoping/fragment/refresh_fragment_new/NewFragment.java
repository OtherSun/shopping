package com.shoping.fragment.refresh_fragment_new;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.shoping.R;
import com.shoping.adapter.Refresh_New_Adapter;
import com.shoping.bean.Refresh_New;
import com.shoping.utils.HttpUtil;
import com.shoping.utils.JsonUtil;

import java.util.List;

/**
 * Created by Administrator on 2017/1/3 0003.
 */

public class NewFragment extends Fragment {
    private View mRootview;
    public static final int WWW = 1111;
    Refresh_New_Adapter adapter;
    GridView gridView;
    List<Refresh_New.GoodsListBean> data;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == WWW) {
                Refresh_New refresh_new = (Refresh_New) msg.obj;
                data = refresh_new.getGoods_list();
                adapter.addData(data);
            }
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootview = inflater.inflate(R.layout.refresh_fragment_gridview, container, false);
        gridView = (GridView) mRootview.findViewById(R.id.refresh_gridview);

        adapter = new Refresh_New_Adapter(getContext());
        gridView.setAdapter(adapter);

        new Thread(new Runnable() {
            @Override
            public void run() {

                String url = "http://apiv2.yangkeduo.com/v3/newlist?page=1&size=20";
                String json = HttpUtil.getRefreshJsom(url);
                Refresh_New refresh_new = JsonUtil.parseZhiJson(json);
                Message msg = new Message();
                msg.what = WWW;
                msg.obj = refresh_new;
                handler.sendMessage(msg);
            }
        }).start();

        return mRootview;
    }
}
