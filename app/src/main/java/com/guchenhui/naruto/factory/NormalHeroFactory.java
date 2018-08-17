package com.guchenhui.naruto.factory;

import com.guchenhui.naruto.HeroConfiguration;

/**
 * 公众号服务号工厂(没有单独task的能力)
 * 普通上忍,中忍的工厂---（相当于普通公众号或者其他服务）
 * Created by chenhuigu on 18/8/15.
 */

public class NormalHeroFactory implements IHeroFactory<HeroConfiguration>{
    @Override
    public BaseHero createHero(HeroConfiguration config) {
        //hero基类中收敛了判空操作，这边不做NPE判断
        return new NormalHero(config);
    }
}
