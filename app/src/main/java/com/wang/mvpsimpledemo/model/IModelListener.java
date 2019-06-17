package com.wang.mvpsimpledemo.model;

/**
 * Created by Wongerfeng on 2018/6/28.
 */

public interface IModelListener {
    void onSuccess(Bean bean);
    void onFailed();
}
