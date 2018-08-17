package com.guchenhui.naruto.hero;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.widget.TextView;

import com.guchenhui.naruto.R;

/**
 * 服务号--桃地再不斩
 * Created by chenhuigu on 18/8/16.
 */

public class SerZabuzaAct extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
//        setTaskDescription(new ActivityManager.TaskDescription("桃地再不斩"));
        setTitle("桃地再不斩");
        ((TextView)findViewById(R.id.name)).setText("服务号-桃地再不斩");
    }
}
