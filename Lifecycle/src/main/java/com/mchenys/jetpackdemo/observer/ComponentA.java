package com.mchenys.jetpackdemo.observer;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * Email 643353964@qq.com
 * Create by mChenys on 2021/5/18
 * Describe: 监听Activity的生命周期变化
 */
public class ComponentA implements LifecycleObserver {
    private String name;

    public ComponentA(String name) {
        this.name = name;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        Log.e("cys", "ComponentA------>" + name + ":onCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        Log.e("cys", "ComponentA------>" + name + ":onStart");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        Log.e("cys", "ComponentA------>" + name + ":onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        Log.e("cys", "ComponentA------>" + name + ":onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        Log.e("cys", "ComponentA------>" + name + ":onStop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestory() {
        Log.e("cys", "ComponentA------>" + name + ":onDestory");
    }


}
