package com.guchenhui.naruto.factory;

import com.guchenhui.naruto.HeroConfiguration;

/**
 * 小程序工厂
 * 影级别忍者的工厂---（相当于小程序，可以拥有独立栈）
 * Created by chenhuigu on 18/8/15.
 */

public class SuperHeroFactory implements IHeroFactory<HeroConfiguration>{
    @Override
    public BaseHero createHero(HeroConfiguration config) {
        //hero基类中收敛了判空操作，这边不做NPE判断
        return new SuperHero(config);
    }
}
