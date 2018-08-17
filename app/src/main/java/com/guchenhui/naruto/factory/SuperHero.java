package com.guchenhui.naruto.factory;

import android.content.Intent;
import android.util.Log;

import com.guchenhui.naruto.HeroConfiguration;

/**
 * 相当于小程序容器
 * Created by chenhuigu on 18/8/16.
 */

public class SuperHero extends BaseHero {

    public SuperHero(HeroConfiguration config) {
        super(config);
        excuteIntent();
    }

    private void excuteIntent() {
//        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
//        mIntent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
    }

    @Override
    public void show() {
        if (mIntent != null) {
            mConfig.getContext().startActivity(mIntent);
        } else {
            Log.v("AlibabaErrorLog", "intent不能为空");
        }
    }
}
