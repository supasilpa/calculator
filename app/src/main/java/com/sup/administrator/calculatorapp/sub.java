package com.sup.administrator.calculatorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sub extends AppCompatActivity {
  EditText e1,e2;
    Button b,b1;
    String s1,s2,s3;
    Integer n1,n2,n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        e1=(EditText)findViewById(R.id.n1);
        e2=(EditText)findViewById(R.id.n2);
        b1=(Button) findViewById(R.id.b1);
        b=(Button)findViewById(R.id.sub2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               s1=e1.getText().toString();
                s2=e2.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                n3=n1-n2;
                s3=String.valueOf(n3);
                Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
