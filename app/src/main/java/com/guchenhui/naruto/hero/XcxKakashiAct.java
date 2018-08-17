package com.guchenhui.naruto.hero;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.widget.TextView;

import com.guchenhui.naruto.R;

/**
 * 小程序--旗木卡卡西
 * Created by chenhuigu on 18/8/16.
 */

public class XcxKakashiAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
//        setTaskDescription(new ActivityManager.TaskDescription("旗木卡卡西"));
        setTitle("旗木卡卡西");
        ((TextView)findViewById(R.id.name)).setText("小程序-旗木卡卡西");
    }
}
