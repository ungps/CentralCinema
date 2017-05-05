package com.example.android.centralcinema;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private int grey, darkGrey;
    private LinearLayout scheduleContent, infoContent;
    private ImageButton scheduleButton, infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grey = ContextCompat.getColor(this, R.color.colorGrey);
        darkGrey = ContextCompat.getColor(this, R.color.colorDarkGrey);
        scheduleContent = (LinearLayout) findViewById(R.id.scheduleContent);
        infoContent = (LinearLayout) findViewById(R.id.infoContent);
        scheduleButton = (ImageButton) findViewById(R.id.scheduleButton);
        infoButton = (ImageButton) findViewById(R.id.infoButton);
    }

    private void changeLayout(LinearLayout oldContent, LinearLayout newContent, ImageButton otherBtn) {
        oldContent.setVisibility(View.GONE);
        newContent.setVisibility(View.VISIBLE);
        otherBtn.setBackgroundColor(darkGrey);
    }

    public void changeContent(View btn) {
        int i = Integer.parseInt(btn.getTag().toString());
        btn.setBackgroundColor(grey);
        if (i == 1) {
            changeLayout(scheduleContent, infoContent, scheduleButton);
        } else {
            changeLayout(infoContent, scheduleContent, infoButton);
        }
    }
}
