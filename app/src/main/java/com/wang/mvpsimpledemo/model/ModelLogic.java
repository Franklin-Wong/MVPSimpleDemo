package com.wang.mvpsimpledemo.model;

/**
 * Created by Wongerfeng on 2018/6/28.
 */

public class ModelLogic implements IModel {

    private Bean mBean = new Bean("data");

    @Override
    public void dataLogic(final String string, final IModelListener listner) {
        new Thread(){
            @Override
            public void run() {
                mBean.setDataString(string);
                listner.onSuccess(mBean);
            }
        }.start();


    }
}
