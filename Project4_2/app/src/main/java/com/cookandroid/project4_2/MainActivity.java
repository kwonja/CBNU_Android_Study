package com.cookandroid.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setIcon(R.drawable.image);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        TextView text1,text2;
        CheckBox chkAgree;
        RadioGroup rGroup1;
        RadioButton rdDog,rdCat,rdRabbit;
        Button btnOK;
        ImageView imgPet;

        chkAgree=(CheckBox) findViewById(R.id.checkBox);
        text1=(TextView) findViewById(R.id.text1);
        text2=(TextView) findViewById(R.id.text2);
        rGroup1=(RadioGroup) findViewById(R.id.Rgroup1);
        rdDog=(RadioButton) findViewById(R.id.Dog);
        rdCat=(RadioButton) findViewById(R.id.Cat);
        rdRabbit=(RadioButton) findViewById(R.id.Rabbit);
        btnOK=(Button)findViewById(R.id.btnOK);
        imgPet=(ImageView) findViewById(R.id.imgpet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkAgree.isChecked()==true)
                {
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    imgPet.setVisibility(android.view.View.VISIBLE);
                    btnOK.setVisibility(android.view.View.VISIBLE);
                }
                else
                {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    imgPet.setVisibility(android.view.View.INVISIBLE);
                    btnOK.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rGroup1.getCheckedRadioButtonId())
                {
                    case R.id.Dog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.Cat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.Rabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplication(),"동물 먼저 선택하세요",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}