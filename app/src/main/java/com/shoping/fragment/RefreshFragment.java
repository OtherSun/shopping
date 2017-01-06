package com.shoping.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shoping.R;
import com.shoping.fragment.refresh_fragment_new.CityFragment;
import com.shoping.fragment.refresh_fragment_new.JingxuanFragment;
import com.shoping.fragment.refresh_fragment_new.NewFragment;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/1/3 0003.
 */

public class RefreshFragment extends Fragment implements TabLayout.OnTabSelectedListener {
    private View mRootView;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ArrayList<Fragment> fragments;
    private TabLayout.Tab tab;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mRootView == null) {
            mRootView = inflater.inflate(R.layout.refresh_fragment, container, false);
        }
        TextView textView = new TextView(inflater.getContext());
        textView.setBackgroundColor(0xFFFFFF);
        mTabLayout = (TabLayout) mRootView.findViewById(R.id.new_Tab);
        mTabLayout.setTabTextColors(0xFF000000, 0xFF009BE1);//可以放到xml文件中配置此属性
        mTabLayout.setSelectedTabIndicatorColor(0xFF009BE1);
        mViewPager = (ViewPager) mRootView.findViewById(R.id.refresh_new_viewpager);

        tab = mTabLayout.newTab().setText("新品上市");
        mTabLayout.addTab(tab);
        tab = mTabLayout.newTab().setText("同城排行");
        mTabLayout.addTab(tab);
        tab = mTabLayout.newTab().setText("精选专题");
        mTabLayout.addTab(tab);

        fragments = new ArrayList<Fragment>();
        //添加WenBaFragment
        fragments.add(new NewFragment());
        fragments.add(new CityFragment());
        fragments.add(new JingxuanFragment());

        //创建适配器
        Fragments_Adapter adapter = new Fragments_Adapter(getChildFragmentManager());
        mViewPager.setAdapter(adapter);
        //为viewpager设置监听
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        //为TabView设置监听
        mTabLayout.addOnTabSelectedListener(this);

        return mRootView;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        mViewPager.setCurrentItem(tab.getPosition(), true);
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    class Fragments_Adapter extends FragmentPagerAdapter {

        public Fragments_Adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }

}
