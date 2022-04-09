package com.cookandroid.project5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(255,255,255));
        setContentView(baseLayout,params);

        EditText edit1 = new EditText(this);
        edit1.setHint("입력하세요");
        baseLayout.addView(edit1);
        Button btn = new Button(this);
        btn.setText("버튼입니다");
        TextView text1 = new TextView(this);
        text1.setTextColor(Color.MAGENTA);
        text1.setTextSize(20);
        btn.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn);
        baseLayout.addView(text1);
        TextView txt=new TextView(this);
        txt.setText("2018038068 권성민");
        txt.setTextColor(Color.rgb(0,0,0));
        txt.setTextSize(15);
        txt.setGravity(Gravity.CENTER);
        baseLayout.addView(txt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(edit1.getText().toString());
            }
        });

    }
}