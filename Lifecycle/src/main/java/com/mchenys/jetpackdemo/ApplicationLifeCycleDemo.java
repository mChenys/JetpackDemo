package com.mchenys.jetpackdemo;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

import com.mchenys.jetpackdemo.observer.ComponentA;

/**
 * Email 643353964@qq.com
 * Create by mChenys on 2021/5/18
 * Describe:
 */
public class ApplicationLifeCycleDemo extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ComponentA("ApplicationLifeCycleDemo"));
    }
}
