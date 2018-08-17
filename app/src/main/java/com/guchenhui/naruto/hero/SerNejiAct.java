package com.guchenhui.naruto.hero;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.widget.TextView;

import com.guchenhui.naruto.R;

/**
 * 服务号--日向宁次
 * Created by chenhuigu on 18/8/16.
 */

public class SerNejiAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
//        setTaskDescription(new ActivityManager.TaskDescription("日向宁次"));
        setTitle("日向宁次");
        ((TextView)findViewById(R.id.name)).setText("服务号-日向宁次");
    }
}
