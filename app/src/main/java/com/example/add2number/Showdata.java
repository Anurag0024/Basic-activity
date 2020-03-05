package com.example.add2number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Showdata extends AppCompatActivity {

    TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);

        t1 = (TextView)findViewById(R.id.tname);
        t2 = (TextView)findViewById(R.id.temail);
        t3 = (TextView)findViewById(R.id.tgender);
        t4 = (TextView)findViewById(R.id.tpass);

        Intent in=getIntent();

        // this is used for the data fetching in the those activity which we want to send the information of the data//
        String sname=in.getStringExtra("name");
        String semail=in.getStringExtra("email");
        String sgender=in.getStringExtra("email");
        String spass = in.getStringExtra("password");



        //this is used for set the data of the fetching point//
        t1.setText(sname);
        t2.setText(semail);
        t3.setText(sgender);
        t4.setText(spass);



    }
}
