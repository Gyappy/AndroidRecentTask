package com.guchenhui.naruto.hero;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.widget.TextView;

import com.guchenhui.naruto.R;

/**
 * 服务号--李洛克
 * Created by chenhuigu on 18/8/16.
 */

public class SerLeeAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
//        setTaskDescription(new ActivityManager.TaskDescription("李洛克"));
        setTitle("李洛克");
        ((TextView)findViewById(R.id.name)).setText("服务号-李洛克");
    }
}
