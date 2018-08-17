package com.guchenhui.naruto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.guchenhui.naruto.factory.IHeroFactory;
import com.guchenhui.naruto.factory.NormalHeroFactory;
import com.guchenhui.naruto.factory.SuperHeroFactory;

public class MainContainerActivity extends Activity implements View.OnClickListener {

    private IHeroFactory heroFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_container);
        findViewById(R.id.naruto).setOnClickListener(this);
        findViewById(R.id.sasuke).setOnClickListener(this);
        findViewById(R.id.kakashi).setOnClickListener(this);
        findViewById(R.id.minato).setOnClickListener(this);
        findViewById(R.id.zabuza).setOnClickListener(this);
        findViewById(R.id.lee).setOnClickListener(this);
        findViewById(R.id.neji).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //四个影级别忍者
            case R.id.naruto:
                initializeFactoryAsSuper();
                heroFactory.createHero(new HeroConfiguration.Builder(this).setName("Naruto").setAge(18).build()).show();
                return;
            case R.id.sasuke:
                initializeFactoryAsSuper();
                heroFactory.createHero(new HeroConfiguration.Builder(this).setName("Sasuke").setAge(18).build()).show();
                return;
            case R.id.kakashi:
                initializeFactoryAsSuper();
                heroFactory.createHero(new HeroConfiguration.Builder(this).setName("Kakashi").setAge(28).build()).show();
                return;
            case R.id.minato:
                initializeFactoryAsSuper();
                heroFactory.createHero(new HeroConfiguration.Builder(this).setName("Minato").setAge(39).build()).show();
                return;

            //普通上忍级别忍者
            case R.id.zabuza:
                initializeFactoryAsNormal();
                heroFactory.createHero(new HeroConfiguration.Builder(this).setName("Zabuza").setAge(29).build()).show();
                return;
            case R.id.lee:
                initializeFactoryAsNormal();
                heroFactory.createHero(new HeroConfiguration.Builder(this).setName("Lee").setAge(19).build()).show();
                return;
            case R.id.neji:
                initializeFactoryAsNormal();
                heroFactory.createHero(new HeroConfiguration.Builder(this).setName("Neji").setAge(25).build()).show();
                return;

            default:
                return;
        }
    }

    void initializeFactoryAsSuper(){
        if(!(heroFactory instanceof SuperHeroFactory)){
            heroFactory = new SuperHeroFactory();
        }
    }

    void initializeFactoryAsNormal(){
        if(!(heroFactory instanceof NormalHeroFactory)){
            heroFactory = new NormalHeroFactory();
        }
    }
}
