package com.example.add2number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button b1;
    EditText e1,e2,e3;

    RadioButton r1,r2,rb;
    RadioGroup  rg1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1=(Button)findViewById(R.id.btn1);

        e1=(EditText)findViewById(R.id.input_name);
        e2=(EditText)findViewById(R.id.e1);
        e3=(EditText)findViewById(R.id.e2);

        rg1=(RadioGroup)findViewById(R.id.raiogroup);

        r1=(RadioButton)findViewById(R.id.m);
        r2=(RadioButton)findViewById(R.id.f);




     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {


             // for storing the data of the mail and gender so it can be the in  comment section anurag //


            final String name = e1.getText().toString();
            final String email = e2.getText().toString();
             final String pass = e3.getText().toString();

             // for using the radiobutton //
             String gender = "";
             if(r1.isChecked())
             {
                 gender = "male";
             }
             else
             {
                 gender = "female";
             }




             Toast.makeText(Login.this,"Name  "+ name+"\nEmail  "+email+"\nPassword  "+pass+"\ngender "+gender,Toast.LENGTH_LONG).show();

               // if you want to use anurag anther method then use it //

            // int i = rg1.getCheckedRadioButtonId();
            // RadioButton rb =(RadioButton)rg1.findViewById(i);
             // fir aise likhenge toast me vern upar ki tarah likho
           //  Toast.makeText(Login.this,"Name  "+ name+"\nEmail  "+email+"\nPassword  "+pass+"/n gender"+rb.getText().toString(),Toast.LENGTH_LONG).show();


             // this two lines is used for the starting the new activity  for using intent//


             Intent in = new Intent(Login.this,Showdata.class);

             in.putExtra("name",name);
             in.putExtra("email",email);
             in.putExtra("gender",gender);
             in.putExtra("password",pass);

             startActivity(in);






         }
     });
    }


}
