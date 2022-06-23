package com.example.pratice4_4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text1,text2;
        Switch chkAgree;
        RadioGroup rGroup1;
        RadioButton v10,v11,v12;
        Button back,end;
        ImageView imgPet;
        getSupportActionBar().setIcon(R.drawable.image2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        chkAgree=(Switch) findViewById(R.id.checkBox);
        text1=(TextView) findViewById(R.id.text1);
        text2=(TextView) findViewById(R.id.text2);
        rGroup1=(RadioGroup) findViewById(R.id.Rgroup1);
        v10=(RadioButton) findViewById(R.id.v10);
        v11=(RadioButton) findViewById(R.id.v11);
        v12=(RadioButton) findViewById(R.id.v12);
        imgPet=(ImageView) findViewById(R.id.imgpet);
        end=(Button) findViewById((R.id.button1));
        back=(Button) findViewById((R.id.button2));

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkAgree.isChecked()==true)
                {
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    imgPet.setVisibility(android.view.View.VISIBLE);
                    back.setVisibility(android.view.View.VISIBLE);
                    end.setVisibility(android.view.View.VISIBLE);
                }
                else
                {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    imgPet.setVisibility(android.view.View.INVISIBLE);
                    back.setVisibility(android.view.View.INVISIBLE);
                    end.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });
        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.v10)
                {
                    imgPet.setImageResource(R.drawable.image0);
                }
                else if(i==R.id.v11)
                {
                    imgPet.setImageResource(R.drawable.image1);
                }
                else if(i==R.id.v12)
                {
                    imgPet.setImageResource(R.drawable.image2);
                }
            }
        });
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v10.setChecked(false);
                v11.setChecked(false);
                v12.setChecked(false);
                imgPet.setImageResource(0);
                text2.setVisibility(android.view.View.INVISIBLE);
                rGroup1.setVisibility(android.view.View.INVISIBLE);
                imgPet.setVisibility(android.view.View.INVISIBLE);
                back.setVisibility(android.view.View.INVISIBLE);
                end.setVisibility(android.view.View.INVISIBLE);
                chkAgree.setChecked(false);
            }
        });

    }
}