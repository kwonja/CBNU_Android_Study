package com.cookandroid.project7_3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView name,email;
    Button button1;
    EditText EdtName,EdtEmail;
    TextView toastText;
    View dialogView, toastView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("사용자정보입력");
        getSupportActionBar().setIcon(R.drawable.image);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        name= findViewById(R.id.name);
        email=(TextView) findViewById(R.id.email);
        button1=(Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView=(View) View.inflate(MainActivity.this,R.layout.dialog1,null);
                AlertDialog.Builder dlg=new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.image);
                dlg.setView(dialogView);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EdtName=(EditText) dialogView.findViewById(R.id.dlgEdt1);
                        EdtEmail=(EditText) dialogView.findViewById(R.id.dlgEdt2);

                        name.setText(EdtName.getText().toString());
                        email.setText(EdtEmail.getText().toString());
                    }
                });
                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast=new Toast(MainActivity.this);
                        toastView = (View)View.inflate(MainActivity.this,R.layout.toast1,null);
                        toastText=(TextView) toastView.findViewById(R.id.toastText1);
                        toastText.setText("취소했습니다");
                        toast.setView(toastView);
                        toast.show();
                    }
                });
                dlg.show();
            }
        });
    }
}