package com.example.kids_learning;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class subtract extends AppCompatActivity {

    EditText num3;
    EditText num4;
    Button sub;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtract);

        num3 = (EditText) findViewById(R.id.etNumber3);
        num4 = (EditText) findViewById(R.id.etNumber4);
        sub = (Button) findViewById(R.id.btnSub);
        result = (TextView) findViewById(R.id.tvAnswere);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int number1 = Integer.parseInt(num3.getText().toString());
                int number2 = Integer.parseInt(num4.getText().toString());
                int sum = number1 - number2;
                result.setText("Answer: "+ String.valueOf(sum));

            }
        });

    }
}