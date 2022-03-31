package com.cookandroid.project4_5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    ImageView image1,image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        image1=(ImageView) findViewById(R.id.imageView);
        image2=(ImageView) findViewById(R.id.imageView2);
        image1.setImageResource(R.drawable.ryan);
        image2.setImageResource(R.drawable.ryan);
        image2.setVisibility(android.view.View.INVISIBLE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image2.setVisibility(android.view.View.INVISIBLE);
                image1.setVisibility(android.view.View.VISIBLE);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.setVisibility(android.view.View.INVISIBLE);
                image2.setVisibility(android.view.View.VISIBLE);
            }
        });
    }
}