package com.wang.mvpsimpledemo.view;

import com.wang.mvpsimpledemo.model.Bean;

/**
 * Created by Wongerfeng on 2018/6/28.
 */

public interface IView {

    String getDataString();
    void viewMethod(Bean bean);

}
