package com.mchenys.jetpackdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mchenys.jetpackdemo.observer.ComponentA;

/**
 * Email 643353964@qq.com
 * Create by mChenys on 2021/5/18
 * Describe:
 */
public class FragmentLifeCycleDemo extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().addObserver(new ComponentA("FragmentLifeCycleDemo"));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText("Fragment的生命周期监听");
        return textView;
    }
}
