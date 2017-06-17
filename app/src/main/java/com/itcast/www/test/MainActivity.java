package com.itcast.www.test;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import javax.crypto.spec.RC5ParameterSpec;

@ContentView(R.layout.activity_main)
public class MainActivity extends FragmentActivity {
    @ViewInject(R.id.fl)
    private FrameLayout fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        x.view().inject(this);

        RequestParams params = new RequestParams("http://www.baidu.com");
        x.http().get(params, new Callback.CommonCallback<String>() {

        });
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fl, new HomeFragment());
        ft.commit();

        int t =22;




//        new Handler().postDelayed()
        Student s = new Student();

        x.http().get(params, new Callback.CommonCallback<String>() {
        })

                new AsyncTask<>()
    }


}
