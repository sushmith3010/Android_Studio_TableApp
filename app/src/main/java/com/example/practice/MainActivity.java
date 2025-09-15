package com.example.practice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;
    private TextView t6;

    private TextView t7;

    private TextView t8;

    private TextView t9;

    private TextView t10;

    private EditText e1;

    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
        t4=findViewById(R.id.textView4);
        t5=findViewById(R.id.textView5);
        t6=findViewById(R.id.textView6);
        t7=findViewById(R.id.textView7);
        t8=findViewById(R.id.textView8);
        t9=findViewById(R.id.textView9);
        t10=findViewById(R.id.textView10);
        e1=findViewById(R.id.editTextNumber);
        b1=findViewById(R.id.button);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Table Generated", Toast.LENGTH_SHORT).show();
                String s1= e1.getText().toString();
                int a;
                a=Integer.parseInt(s1);

                t1.setText(a+ "*"+"1"+"="+String.valueOf(a*1));
                t2.setText(String.valueOf(a+ "*"+"2"+"="+a*2));
                t3.setText(String.valueOf(a+ "*"+"3"+"="+a*3));
                t4.setText(String.valueOf(a+ "*"+"4"+"="+a*4));
                t5.setText(String.valueOf(a+ "*"+"5"+"="+a*5));
                t6.setText(String.valueOf(a+ "*"+"6"+"="+a*6));
                t7.setText(String.valueOf(a+ "*"+"7"+"="+a*7));
                t8.setText(String.valueOf(a+ "*"+"8"+"="+a*8));
                t9.setText(String.valueOf(a+ "*"+"9"+"="+a*9));
                t10.setText(String.valueOf(a+ "*"+"10"+"="+a*10));



            }
        });





    }
}