package com.shoping.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shoping.R;
import com.shoping.bean.Refresh_New;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/3 0003.
 */

public class Refresh_New_Adapter extends BaseAdapter {
    private List<Refresh_New.GoodsListBean> data = new ArrayList<>();
    private Context mContent;

    public Refresh_New_Adapter(Context context) {
        this.mContent = context;
    }

    /**
     * 向适配器中添加数据的方法
     */
    public void addData(List<Refresh_New.GoodsListBean> refreshs) {
        data.addAll(refreshs);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContent);
            convertView = inflater.inflate(R.layout.refresh_fragment_item, parent, false);

            ViewHolder holder = new ViewHolder();
//            holder.userIcom = (ImageView) convertView.findViewById(R.id.refresh_bg_img);
            holder.normal_price = (TextView) convertView.findViewById(R.id.price_tv);
            holder.time = (TextView) convertView.findViewById(R.id.time_tv);
            holder.market_price = (TextView) convertView.findViewById(R.id.save_tv);
            holder.bgImg = (ImageView) convertView.findViewById(R.id.refresh_bg_img);
            convertView.setTag(holder);
        }

        ViewHolder holder = (ViewHolder) convertView.getTag();
        Refresh_New.GoodsListBean dataBean = data.get(position);

//        holder.userIcom.setImageResource(R.mipmap.default_user_img);
//        Picasso.with(mContent).load("http://img.96211.com/" + dataBean.getUserIcon() + "?imageView2/0/w/80").into(holder.userIcom);

        holder.normal_price.setText("￥" + dataBean.getNormal_price() / 100 + "." + dataBean.getNormal_price() % 100);
        holder.market_price.setText("节省了" + dataBean.getMarket_price() / 100 + "." + dataBean.getMarket_price() % 100 + "元");
        Refresh_New refresh_new = new Refresh_New();
//        holder.time.setText((dataBean.getTime() - refresh_new.getServer_time())+"分钟前");
        holder.time.setText(5+"分钟前");

        holder.bgImg.setImageResource(R.mipmap.default_image);
        Picasso.with(mContent).load(dataBean.getHd_thumb_url()).into(holder.bgImg);

        return convertView;
    }

    class ViewHolder {
        //        ImageView userIcom;
        TextView time;
        TextView market_price;
        TextView normal_price;
        ImageView bgImg;
    }
}
