package com.guchenhui.naruto.factory;

import android.util.Log;

import com.guchenhui.naruto.HeroConfiguration;
import com.guchenhui.naruto.factory.BaseHero;

/**
 * 相当于公众号服务号容器
 * Created by chenhuigu on 18/8/15.
 */

public class NormalHero extends BaseHero {
    public NormalHero(HeroConfiguration config) {
        super(config);
    }

    @Override
    public void show() {
        if(mIntent!=null){
            mConfig.getContext().startActivity(mIntent);
        }else{
            Log.v("AlibabaErrorLog","intent不能为空");
        }
    }
}
