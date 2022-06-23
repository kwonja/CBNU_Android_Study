package com.cookandroid.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    Button add,sub,multi,div;
    TextView textresult;
    String num1,num2;
    Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");
        getSupportActionBar().setIcon(R.drawable.image);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        edit1=(EditText) findViewById(R.id.edit1);
        edit2 =(EditText) findViewById(R.id.edit2);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        multi=(Button) findViewById(R.id.multiply);
        div=(Button) findViewById(R.id.div);
        textresult=(TextView) findViewById(R.id.textresult);
        add.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1) + Integer.parseInt(num2);
                textresult.setText("계산 결과 : "+result.toString());
                return false;
            }
        });
        sub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1) - Integer.parseInt(num2);
                textresult.setText("계산 결과 : "+result.toString());
                return false;
            }
        });
        multi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1) * Integer.parseInt(num2);
                textresult.setText("계산 결과 : "+result.toString());
                return false;
            }
        });
        div.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1) / Integer.parseInt(num2);
                textresult.setText("계산 결과 : "+result.toString());
                return false;
            }
        });

    }
}