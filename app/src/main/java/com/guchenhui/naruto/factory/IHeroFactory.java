package com.guchenhui.naruto.factory;

/**
 * 子程序工厂（可以派生出小程序，公众号或者是第三第四种类型的子程序的工厂）
 * Created by chenhuigu on 18/8/15.
 */

public interface IHeroFactory<T>{
    BaseHero createHero(T config);
}
