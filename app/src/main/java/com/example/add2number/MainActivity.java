package com.example.add2number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    TextView t1,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.btn1);
        t1 = (TextView)findViewById(R.id.resadd);
        b2 = (Button)findViewById(R.id.btn2);
        t4 = (TextView) findViewById(R.id.ressub);
        b3 = (Button) findViewById(R.id.btn23);
        b4 = (Button)findViewById(R.id.bvis);
         b5=(Button)findViewById(R.id.sk1);
         b6=(Button)findViewById(R.id.bcon1);
        b7=(Button)findViewById(R.id.b45);
        b8=(Button)findViewById(R.id.b12);


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
                startActivity(i);
            }
        });

         b6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent in =new Intent(MainActivity.this,converterrupee.class);
                 startActivity(in);
             }
         });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anu = new Intent(MainActivity.this,visibility.class);
                startActivity(anu);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int i = Integer.parseInt(e1.getText().toString());
            int j = Integer.parseInt(e2.getText().toString());
            int k = i-j;
            t4.setText("ans is" +k);
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent in = new Intent(MainActivity.this,Login.class);
               startActivity(in);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(MainActivity.this,seekbar.class);
                startActivity(in);
            }
        });
    }







  public void add(View V)
    {
        System.out.println("button is clicked");
        int i=Integer.parseInt(e1.getText().toString());
        int j=Integer.parseInt(e2.getText().toString());

        int k=i+j;
        t1.setText("ans is "+k);

    }

}

