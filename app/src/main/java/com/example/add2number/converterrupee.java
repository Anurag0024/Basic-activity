package com.example.add2number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class converterrupee extends AppCompatActivity {

    Button b1;
    EditText e1;
    TextView t1,t2;
    RatingBar rb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converterrupee);

        b1=(Button)findViewById(R.id.btn1);
        e1=(EditText)findViewById(R.id.ed1);
        t1=(TextView)findViewById(R.id.tv1);
        t2=(TextView)findViewById(R.id.tv3);
        rb=(RatingBar)findViewById(R.id.rt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double d1=Double.parseDouble(e1.getText().toString());
                Double dollar=71.72*d1;
                String toastmsg =""+dollar.toString()+"Rs.";
                t1.setText(toastmsg);
                Toast.makeText(converterrupee.this,toastmsg,Toast.LENGTH_LONG).show();
            }
        });

        //this is used for the listener using rating bar//
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                t2.setText("value is"+v);

            }
        });


    }
}
