package com.guchenhui.naruto.hero;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.widget.TextView;

import com.guchenhui.naruto.R;

/**
 * 小程序--漩涡鸣人
 * Created by chenhuigu on 18/8/16.
 */

public class XcxNarutoAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
//        setTaskDescription(new ActivityManager.TaskDescription("旋涡鸣人"));
        setTitle("旋涡鸣人");
        ((TextView)findViewById(R.id.name)).setText("小程序-旋涡鸣人");
    }


}
