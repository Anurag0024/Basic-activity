package com.example.add2number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class seekbar extends AppCompatActivity {

    TextView t1,t2;
    SeekBar sk1;
    EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        t1= (TextView)findViewById(R.id.tv1);
        t2= (TextView)findViewById(R.id.tv2);
        sk1=(SeekBar)findViewById(R.id.sk1);
        e1=(EditText)findViewById(R.id.ed1);

        sk1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)
            {
                t1.setTextSize(i+5);
                t2.setText(i+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });



    }
}
