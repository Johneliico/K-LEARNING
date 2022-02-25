package com.example.kids_learning;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class adding extends AppCompatActivity {

     private EditText num1, num2;
     private Button add;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding);

        num1 = (EditText) findViewById(R.id.etNumber1);
        num2 = (EditText) findViewById(R.id.etNumber2);
        add = (Button) findViewById(R.id.btnAdd);
        result = (TextView) findViewById(R.id.tvAnswer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1+number2;
                result.setText("Answer: "+ String.valueOf(sum));

            }
        });

    }
}