package com.sarkartech.digitalclock;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    TextClock TextClockId,TextAmPmId,TextDateId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        TextClockId = findViewById(R.id.TextClockId);
        TextAmPmId = findViewById(R.id.TextAmPmId);
        TextDateId = findViewById(R.id.TextDateId);
        Typeface myfont = Typeface.createFromAsset(getApplicationContext().getAssets(),"font/digital.ttf");
        TextClockId.setTypeface(myfont);
        TextAmPmId.setTypeface(myfont);
        TextDateId.setTypeface(myfont);

    }
}