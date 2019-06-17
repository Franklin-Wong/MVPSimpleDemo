package com.wang.mvpsimpledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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


    }

    private void initEvent() {

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPressentor.method();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEtName.setText("");
                mEtPassword.setText("");
            }
        });

    }

    private void initView() {

        mEtName = findViewById(R.id.etName);
        mEtPassword = findViewById(R.id.etPassword);

        mSubmit = findViewById(R.id.submit);
        clear = findViewById(R.id.clear);


    }

    @Override
    public String getDataString() {
        return mEtName.getText().toString();
    }

    @Override
    public void viewMethod(Bean bean) {
        Log.i(TAG, "viewMethod: bean : "+bean.toString());
    }
}
