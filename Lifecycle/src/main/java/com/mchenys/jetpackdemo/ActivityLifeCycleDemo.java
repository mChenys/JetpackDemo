package com.mchenys.jetpackdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mchenys.jetpackdemo.observer.ComponentA;

public class ActivityLifeCycleDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 注册监听
        getLifecycle().addObserver(new ComponentA("ActivityLifeCycleDemo"));
    }

    public void loadFragment(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new FragmentLifeCycleDemo())
                .commitAllowingStateLoss();
    }

    public void startService(View view) {
        startService(new Intent(this, ServiceLifeCycleDemo.class));
    }

    public void stopService(View view) {
        stopService(new Intent(this, ServiceLifeCycleDemo.class));
    }
}