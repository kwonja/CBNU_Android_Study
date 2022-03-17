package com.example.pratice27;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button letterbutton;
    Button homebutton;
    ImageView andriodImage;
    RadioGroup RGroup;
    EditText print;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setIcon(R.drawable.image);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        letterbutton=(Button) findViewById(R.id.letterbuttion);

        print=(EditText) findViewById((R.id.editTextDate));
        letterbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),print.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        homebutton=(Button) findViewById(R.id.homebutton);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page= new Intent(Intent.ACTION_VIEW, Uri.parse(print.getText().toString()));
                startActivity(page);
            }
        });
        andriodImage=(ImageView) findViewById(R.id.androidVersionImage);
        RGroup=(RadioGroup) findViewById(R.id.radio_group);
        RGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.radio_r)
                {
                    andriodImage.setImageResource(R.drawable.image2);
                }
                else
                {
                    andriodImage.setImageResource(R.drawable.image);
                }
            }
        });
    }
}