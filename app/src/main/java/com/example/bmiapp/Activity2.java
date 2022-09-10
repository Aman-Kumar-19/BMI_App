package com.example.bmiapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.bmiapp.databinding.Activity2Binding;

public class Activity2 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }
    public void calcbmi(View view){

        double height = 0;
        double weight = 0;
        double bmi = 0;
        String msg = "";

        EditText et1 = (EditText) findViewById(R.id.editText1); // weight
        EditText et2 = (EditText) findViewById(R.id.editText2); // height

        Button b1 = (Button) findViewById(R.id.button2);
        TextView t1 = (TextView) findViewById(R.id.textView1);
        TextView t2 = (TextView) findViewById(R.id.textView2);

        weight = Double.parseDouble(et1.getText().toString());
        height = Double.parseDouble(et2.getText().toString());

        bmi = height*height;
        bmi = weight/bmi;

        t1.setText(String.valueOf(bmi));

        if(bmi<18.5){
            msg = "Under Weight";
        }else if(bmi>=18.5 && bmi<25) {
            msg = "Normal Weight";
        }else if(bmi>=25){
            msg = "Over weight";
        }
        t2.setText(msg);
    }

}


