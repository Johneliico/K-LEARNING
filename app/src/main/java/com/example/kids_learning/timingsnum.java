package com.example.kids_learning;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class timingsnum extends AppCompatActivity {

    private EditText edittext1,edittext2;
    private TextView textView;
    private Button buttonMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timingsnum);

        multiplyOnButtonClick();
    }

    public void multiplyOnButtonClick(){
        edittext1=(EditText)findViewById(R.id.editText1);
        edittext2=(EditText)findViewById(R.id.editText2);
        textView=(TextView) findViewById(R.id.textView4);
        buttonMulti=(Button)findViewById(R.id.button);

        buttonMulti.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                Double num1=Double.parseDouble(value1);
                Double num2=Double.parseDouble(value2);
                double multi=num1*num2;
                textView.setText(""+multi);
                Toast.makeText(getApplicationContext(),String.valueOf(multi),Toast.LENGTH_LONG).show();
            }

        });



    }

    }
