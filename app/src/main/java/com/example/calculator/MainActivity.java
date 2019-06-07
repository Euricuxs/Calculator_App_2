package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText edit1;
    EditText edit2;
    TextView answer;
    Button calcu;
    Button add;
    Button sub;
    Button mul;
    Button div;

    int num1;
    int num2;
    int result;
    double result2;

    boolean addition;
    boolean subtraction;
    boolean multiplication;
    boolean division;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.valueOne);
        edit2 = findViewById(R.id.valueTwo);
        calcu = findViewById(R.id.btncalcu);
        answer = findViewById(R.id.viewAns);
        add = findViewById(R.id.btnadd);
        sub = findViewById(R.id.btnsub);
        mul = findViewById(R.id.btnmul);
        div = findViewById(R.id.btndiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = num1 + num2;
                addition = true;
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = num1 - num2;
                subtraction = true;
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = num1 * num2;
                multiplication = true;
            }
        });

        div.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                    num1 = Integer.parseInt(edit1.getText().toString());
                    num2 = Integer.parseInt(edit2.getText().toString());
                    try
                    {
                        if(num2 == 0)
                        {
                            answer.setText("Cannot divide by zero");
                            division = false;
                        }
                        else
                        {
                            result2 = (double) num1 / num2;
                            division = true;
                        }
                    }
                    catch(Exception e)
                    {
                        answer.setText("Could not divide!");
                    }
            }
        });

        calcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition == true)
                {
                    answer.setText(String.valueOf(result));
                    addition = false;
                }
                if(subtraction == true)
                {
                    answer.setText(String.valueOf(result));
                    subtraction = false;
                }
                if(multiplication == true)
                {
                    answer.setText(String.valueOf(result));
                    multiplication = false;
                }
                if(division == true)
                {
                    answer.setText(String.valueOf(result2));
                    division = false;
                }
            }
        });


    }
}
