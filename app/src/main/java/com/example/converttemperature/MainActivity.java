package com.example.converttemperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    Button ansButton,againButton;
    TextView showAns;
    EditText getVal;
    RadioButton CtoF,FtoC;
    Double x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ansButton =(Button) findViewById(R.id.ansButton);
        showAns = (TextView) findViewById(R.id.showAns);
        getVal = (EditText) findViewById(R.id.getVal);
        CtoF = (RadioButton) findViewById(R.id.CtoF);
        FtoC = (RadioButton) findViewById(R.id.FtoC);
        againButton = (Button) findViewById(R.id.againButton);
        ansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getVal.getText().toString().isEmpty()) {
                    showAns.setText("Write Temperature");
                } else {

                    x = Double.parseDouble(String.valueOf(getVal.getText()));
                }
                    if (CtoF.isChecked()){
                        x = (x * 9) / 5 + 32;
                    //this formula is for farhenhite
                    x = Double.parseDouble(new DecimalFormat("##.###").format(x));
                    showAns.setText(String.valueOf(x) + " -  Degree Fahrenheit");
                }
               else if (FtoC.isChecked()) {
                    x = (x - 32) * 5 / 9;
                    x = Double.parseDouble(new DecimalFormat("##.###").format(x));
                    showAns.setText(String.valueOf(x) + " - Degree Celcius");
                }
            }
        });



}

}