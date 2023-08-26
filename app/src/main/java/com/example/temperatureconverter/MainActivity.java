package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView textView1,textView;

    public EditText editText;


    public ConstraintLayout cl;


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
            double c =0;
            double f =0;

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
c=data;
                ans=Double.toString(f)+"°F";
                textView.setText(ans);
        }

            if (c>=18 && c<=24){
cl.setBackgroundColor(getResources().getColor(R.color.neutral));
            }
            else if(c<18){
                cl.setBackgroundColor(getResources().getColor(R.color.lightblue));

            }else if(c>24){
                cl.setBackgroundColor(getResources().getColor(R.color.orange));

            }else{
                Toast.makeText(getApplicationContext(),"Err",Toast.LENGTH_SHORT).show();
            }

        }catch (Exception e){
            editText=findViewById(R.id.editText);

            Toast.makeText(getApplicationContext(),"only numbers",Toast.LENGTH_SHORT).show();
            editText.setText("");
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