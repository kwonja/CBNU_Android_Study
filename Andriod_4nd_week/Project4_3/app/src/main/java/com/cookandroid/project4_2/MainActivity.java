package com.cookandroid.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    Button add,sub,multi,div,mod;
    TextView textresult;
    String num1,num2;
    Float result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setIcon(R.drawable.image);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        edit1=(EditText) findViewById(R.id.edit1);
        edit2 =(EditText) findViewById(R.id.edit2);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        multi=(Button) findViewById(R.id.multiply);
        div=(Button) findViewById(R.id.div);
        mod=(Button) findViewById((R.id.mod));
        textresult=(TextView) findViewById(R.id.textresult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().length()!=0 && edit2.getText().toString().length()!=0)
                {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1)+ Float.parseFloat(num2);
                    textresult.setText("계산 결과 : " + result.toString());
                }
                else
                {
                    Toast.makeText(getApplication(),"입력값이 없습니다",Toast.LENGTH_SHORT).show();
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().length()!=0 && edit2.getText().toString().length()!=0) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1)- Float.parseFloat(num2);
                    textresult.setText("계산 결과 : " + result.toString());
                }
                else
                {
                    Toast.makeText(getApplication(),"입력값이 없습니다",Toast.LENGTH_SHORT).show();
                }
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().length()!=0 && edit2.getText().toString().length()!=0) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textresult.setText("계산 결과 : " + result.toString());
                }
                else
                {
                    Toast.makeText(getApplication(),"입력값이 없습니다",Toast.LENGTH_SHORT).show();
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().length()!=0 && edit2.getText().toString().length()!=0) {
                    if(edit2.getText().toString().equals("0"))
                    {
                        Toast.makeText(getApplication(),"0으로 나눌수 없습니다",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        result = Float.parseFloat(num1) / Float.parseFloat(num2);
                        textresult.setText("계산 결과 : " + result.toString());
                    }
                }
                else
                {
                    Toast.makeText(getApplication(),"입력값이 없습니다",Toast.LENGTH_SHORT).show();
                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().length()!=0 && edit2.getText().toString().length()!=0) {
                    if(edit2.getText().toString().equals("0"))
                    {
                        Toast.makeText(getApplication(),"0으로 나눌수 없습니다",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        result = Float.parseFloat(num1) % Float.parseFloat(num2);
                        textresult.setText("계산 결과 : " + result.toString());
                    }
                }
                else
                {
                    Toast.makeText(getApplication(),"입력값이 없습니다",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}