package com.example.android.centralcinema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeContent(View btn) {
        int i = Integer.parseInt(btn.getTag().toString());
        //70FFFFFF when selected
        //00000000 when not selected
        btn.setBackgroundColor(0x70FFFFFF);
        if(i==1) {
            LinearLayout one = (LinearLayout) findViewById(R.id.scheduleContent);
            one.setVisibility(View.GONE);
            one = (LinearLayout) findViewById(R.id.infoContent);
            one.setVisibility(View.VISIBLE);
            ImageButton otherBtn = (ImageButton) findViewById(R.id.scheduleButton);
            otherBtn.setBackgroundColor(0x00000000);
        } else {
            LinearLayout one = (LinearLayout) findViewById(R.id.infoContent);
            one.setVisibility(View.GONE);
            one = (LinearLayout) findViewById(R.id.scheduleContent);
            one.setVisibility(View.VISIBLE);
            ImageButton otherBtn = (ImageButton) findViewById(R.id.infoButton);
            otherBtn.setBackgroundColor(0x00000000);
        }
    }
}
