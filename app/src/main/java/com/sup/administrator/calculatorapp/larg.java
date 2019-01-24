package com.sup.administrator.calculatorapp;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class larg extends AppCompatActivity {
EditText e1,e2,e3,e4;
    Button b,b1;
    String s1,s2,s3,s4,s5,s6;
    Integer n1,n2,n3,n4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_larg);
        e1=(EditText)findViewById(R.id.l1);
        e2=(EditText)findViewById(R.id.l2);
        e3=(EditText)findViewById(R.id.l3);
        e4=(EditText)findViewById(R.id.larres1);
        b=(Button)findViewById(R.id.lar);
        b1=(Button)findViewById(R.id.bl);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                n3=Integer.parseInt(s3);
                if((n1>n2) && (n1>n3))
                {

                    s4=String.valueOf(n1);
                    e4.setText(s4);
                    e4.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),s4,Toast.LENGTH_LONG).show();
                }
                else if((n2>n1) && (n2>n3))
                {

                    s5=String.valueOf(n2);
                    e4.setText(s5);
                    e4.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),s5,Toast.LENGTH_LONG).show();
                }
                else
                {
                    s6=String.valueOf(n3);
                    e4.setText(s6);
                    e4.setVisibility(View.VISIBLE);
               Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(o);
            }
        });



    }
}
