package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView textView1,textView;
public ConstraintLayout cl;
    public EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }
    public void convert(View v){
        try {
cl=findViewById(R.id.mainwin);
            editText=findViewById(R.id.editText);
            double data=Integer.parseInt(editText.getText().toString());
            textView=findViewById(R.id.textView8);
            double c;
            double f;
            String ans;
            Switch sw=findViewById(R.id.converter);
            if (sw.isChecked()){

                c=((data-32)*5/9);
                int temp=(int)c;
                ans=Integer.toString(temp)+"°C";
                textView.setText(ans);



            }
            else{

                f=((data*9)/5)+32;

                ans=Double.toString(f)+"°F";
                textView.setText(ans);
        }

        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
        }





    }
    public void check(View v){
        editText=findViewById(R.id.editText);
        textView1=findViewById(R.id.textView7);
        Switch sw=(Switch) v;
        if (sw.isChecked()){
            editText.setHint("Enter in Farhenite");

            Toast.makeText(getApplicationContext(),"Unit Changed",Toast.LENGTH_SHORT).show();
            textView1.setText("Fahernheit to Celsius");
        }else{
            editText.setHint("Enter in Celsius");

            textView1.setText("Celsius to Fahernheit");

        }
    }


}