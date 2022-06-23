package com.cookandroid.project5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        getSupportActionBar().setIcon(R.drawable.image);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor((Color.rgb(0,255,0)));
        setContentView(baseLayout,params);

        Button btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.MAGENTA);
        baseLayout.addView(btn);
        TextView txt=new TextView(this);
        txt.setText("2018038068 권성민");
        txt.setTextColor(Color.rgb(255,255,255));
        txt.setTextSize(30);
        txt.setGravity(Gravity.CENTER);
        baseLayout.addView(txt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"코드로 생성한 버튼입니다", Toast.LENGTH_SHORT).show();
            }
        });
}}