package com.example.stone.htjcenterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

@SuppressWarnings("ConstantConditions")
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private NightModeHelper mNightModeHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNightModeHelper = new NightModeHelper(this);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                mNightModeHelper.toggle();//可以在recreate()的时候,截图做动画提高用户体验
                break;
            default:
                break;
        }
    }


}
