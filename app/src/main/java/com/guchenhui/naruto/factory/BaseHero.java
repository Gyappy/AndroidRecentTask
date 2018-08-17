package com.guchenhui.naruto.factory;

import android.content.Intent;
import android.util.Log;

import com.guchenhui.naruto.Const;
import com.guchenhui.naruto.HeroConfiguration;

/**
 * hero容器的基类
 * Created by chenhuigu on 18/8/15.
 */

public abstract class BaseHero {

    public HeroConfiguration mConfig;
    public Intent mIntent;

    public BaseHero(HeroConfiguration config) {
        if (config == null) {
            throw new RuntimeException("context couldn't be null");
        }
        mConfig = config;
        try {
            mIntent = new Intent(mConfig.getContext(), Const.getHeroClassByName(mConfig.getName()));
        } catch (Exception e) {
            Log.v("AlibabaErrorLog",mConfig.getName()+"这个class无法被识别，检查下是否在Const中注册");
        }
    }

    public abstract void show();
}
