package com.wang.mvpsimpledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.wang.mvpsimpledemo.model.Bean;
import com.wang.mvpsimpledemo.pressentor.Pressentor;
import com.wang.mvpsimpledemo.view.IView;

public class MainActivity extends AppCompatActivity implements IView {
    private static final String TAG = "MainActivity";

    private EditText mEtName, mEtPassword;
    private Button mSubmit,clear;



    private Pressentor mPressentor = new Pressentor(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();

        mPressentor.method();
    }

    private void initEvent() {



    }

    private void initView() {



    }

    @Override
    public String getDataString() {
        return null;
    }

    @Override
    public void viewMethod(Bean bean) {
        Log.i(TAG, "viewMethod: bean : "+bean.toString());
    }
}
