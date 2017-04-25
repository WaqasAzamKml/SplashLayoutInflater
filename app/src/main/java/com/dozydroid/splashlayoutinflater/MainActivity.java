package com.dozydroid.splashlayoutinflater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    LayoutInflater layoutInflater;
    View btnView;
    RelativeLayout layoutContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutContainer = (RelativeLayout) findViewById(R.id.layoutContainer);

        layoutInflater = getLayoutInflater();
        btnView = layoutInflater.inflate(R.layout.button_layout, null);

        layoutContainer.addView(btnView);
    }
}
