package com.shoping.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shoping.R;

/**
 * Created by Administrator on 2017/1/3 0003.
 */

public class PersonalFragment extends Fragment {
    View mRootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mRootview == null) {
            mRootview = inflater.inflate(R.layout.personal_fragment, container, false);
        }
        return mRootview;
    }
}
