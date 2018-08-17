package com.guchenhui.naruto.hero;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.widget.TextView;

import com.guchenhui.naruto.R;

/**
 * 小程序--宇智波佐助
 * Created by chenhuigu on 18/8/16.
 */

public class XcxSasukeAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
//        setTaskDescription(new ActivityManager.TaskDescription("宇智波佐助"));
        setTitle("宇智波佐助");
        ((TextView)findViewById(R.id.name)).setText("小程序-宇智波佐助");
    }

}
