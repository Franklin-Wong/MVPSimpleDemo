package com.wang.mvpsimpledemo.pressentor;

import android.os.Handler;
import android.util.Log;

import com.wang.mvpsimpledemo.model.Bean;
import com.wang.mvpsimpledemo.model.IModel;
import com.wang.mvpsimpledemo.model.IModelListener;
import com.wang.mvpsimpledemo.model.ModelLogic;
import com.wang.mvpsimpledemo.view.IView;


/**
 * Created by Wongerfeng on 2018/6/28.
 */

public class Pressentor {
    private static final String TAG = "Pressentor";

    private IView mIView;

    private IModel mIModel;

    private Handler mHandler = new Handler();
    public Pressentor(IView iView) {
        mIView = iView;
        mIModel = new ModelLogic();
    }

    public void method(){
        //通过mIvew接口的实例对象， 获取View层数据
        mIModel.dataLogic(mIView.getDataString(), new IModelListener() {
            @Override
            public void onSuccess(final Bean bean) {
                Log.i(TAG, "onSuccess: ");
                //发送到UI线程 在UI
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mIView.viewMethod(bean);
                    }
                });
            }

            @Override
            public void onFailed() {
                Log.i(TAG, "onFailed: ");
            }
        });
    }
}
