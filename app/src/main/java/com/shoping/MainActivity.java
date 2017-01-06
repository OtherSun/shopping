package com.shoping;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.shoping.fragment.HomeFragment;
import com.shoping.fragment.PersonalFragment;
import com.shoping.fragment.RefreshFragment;
import com.shoping.fragment.ResearchFragment;
import com.shoping.fragment.ShopFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.main_Fragment_container)
    FrameLayout mainFragmentContainer;
    @BindView(R.id.main_tab_RadioButtom_container)
    RadioGroup mainTabRadioButtomContainer;
    @BindView(R.id.home_RadioButton)
    RadioButton homeRadioButton;
    @BindView(R.id.shop_RadioButton)
    RadioButton shopRadioButton;
    @BindView(R.id.refresh_RadioButton)
    RadioButton reflshRadioButton;
    @BindView(R.id.research_RadioButton)
    RadioButton researchRadioButton;
    @BindView(R.id.me_RadioButton)
    RadioButton meRadioButton;

    private HomeFragment mHomerFragment;
    private PersonalFragment mMeFrament;
    private ResearchFragment mResearchFragment;
    private ShopFragment mShopFragment;
    private RefreshFragment mReflshFragment;

    private FragmentManager mFragmentManager;
    private FragmentTransaction mTransaction;
    private Fragment mCurrentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();

    }

    private void init() {
        mHomerFragment = new HomeFragment();
        mReflshFragment = new RefreshFragment();
        mShopFragment = new ShopFragment();
        mResearchFragment = new ResearchFragment();
        mMeFrament = new PersonalFragment();

//        切换fragment页面
        getChangeFragmentView(mHomerFragment, mHomerFragment.isAdded());
    }

    private void getChangeFragmentView(Fragment fragment, boolean isAdd) {
        if (mFragmentManager == null) {
            mFragmentManager = getSupportFragmentManager();
        }
        mTransaction = mFragmentManager.beginTransaction();
        if (!isAdd) {
            mTransaction.add(R.id.main_Fragment_container, fragment);
        }
        if (mCurrentFragment != null) {
            mTransaction.hide(mCurrentFragment);
        }
        mTransaction.show(fragment);
        mTransaction.commit();
        mCurrentFragment = fragment;
    }

    @OnClick(R.id.home_RadioButton)
    public void onHomeClick(View view) {
        getChangeFragmentView(mHomerFragment, mHomerFragment.isAdded());
    }

    @OnClick(R.id.refresh_RadioButton)
    public void onReflshClick(View view) {
        getChangeFragmentView(mReflshFragment, mReflshFragment.isAdded());
    }

    @OnClick(R.id.shop_RadioButton)
    public void onShopClick(View view) {
        getChangeFragmentView(mShopFragment, mShopFragment.isAdded());
    }

    @OnClick(R.id.research_RadioButton)
    public void onResearchClick(View view) {
        getChangeFragmentView(mResearchFragment, mResearchFragment.isAdded());
    }

    @OnClick(R.id.me_RadioButton)
    public void onMeClick(View view) {
        getChangeFragmentView(mMeFrament, mMeFrament.isAdded());
    }
}
