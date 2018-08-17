package com.guchenhui.naruto;

import android.content.Context;

/**
 * Created by chenhuigu on 18/8/15.
 */

public class HeroConfiguration {

    Context context;
    String name;
    String level;
    int age;

    private HeroConfiguration() {
    }

    private HeroConfiguration(Builder builder) {
        this.context = builder.context;
        this.name = builder.name;
        this.level = builder.level;
        this.age = builder.age;
    }

    public static class Builder {
        private Context context;
        private String name;
        private String level;
        private int age;

        public Builder(Context context) {
            //没有context无法打开页面，可在测试阶段规避此问题
            if (context == null) {
                throw new RuntimeException("context couldn't be null");
            }
            this.context = context;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setLevel(String level) {
            this.level = level;
            return this;
        }

        public HeroConfiguration build() {
            return new HeroConfiguration(this);
        }
    }

    public Context getContext() {
        return context;
    }

    public String getName() {
        return name == null ? name = "" : name;
    }

    public String getLevel() {
        return level == null ? level = "" : level;
    }

    public int getAge() {
        return age;
    }
}
