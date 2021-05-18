package com.mchenys.jetpackdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.lifecycle.LifecycleService;

import com.mchenys.jetpackdemo.observer.ComponentA;

/**
 * Email 643353964@qq.com
 * Create by mChenys on 2021/5/18
 * Describe: 记得在清单文件中注册服务
 */
public class ServiceLifeCycleDemo extends LifecycleService {
    public ServiceLifeCycleDemo() {
        getLifecycle().addObserver(new ComponentA("ServiceLifeCycleDemo"));
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("cys", "ServiceLifeCycleDemo start");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("cys", "ServiceLifeCycleDemo stop");
    }

}
