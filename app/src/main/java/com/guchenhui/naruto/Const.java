package com.guchenhui.naruto;

import com.guchenhui.naruto.hero.SerLeeAct;
import com.guchenhui.naruto.hero.SerNejiAct;
import com.guchenhui.naruto.hero.SerZabuzaAct;
import com.guchenhui.naruto.hero.XcxKakashiAct;
import com.guchenhui.naruto.hero.XcxMinatoAct;
import com.guchenhui.naruto.hero.XcxNarutoAct;
import com.guchenhui.naruto.hero.XcxSasukeAct;

import java.util.HashMap;
import java.util.Map;

/**
 * 添加新的小程序或者服务号，只需要扩展这个映射表,以及在业务层传入新的小程序的config即可，不需要改动老代码  符合开闭原则
 * Created by chenhuigu on 18/8/16.
 */

public class Const {
    public static Map<String, Class> mMap = new HashMap<>();

    static {
        mMap.put("Naruto", XcxNarutoAct.class);
        mMap.put("Sasuke", XcxSasukeAct.class);
        mMap.put("Kakashi", XcxKakashiAct.class);
        mMap.put("Minato", XcxMinatoAct.class);
        mMap.put("Zabuza", SerZabuzaAct.class);
        mMap.put("Lee", SerLeeAct.class);
        mMap.put("Neji", SerNejiAct.class);
    }

    public static Class getHeroClassByName(String name) {
        return mMap.get(name);
    }
}
