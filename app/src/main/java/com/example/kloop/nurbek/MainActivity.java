package com.example.kloop.nurbek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.kloop.nurbek.R.id.minusButton;

public class MainActivity extends AppCompatActivity {

    int a, b, c;

    String firstNumber;
    String secondNumber;
    EditText firstNumberEditText;
    EditText secondNumberEditText;
    TextView textView;
    Button plus, minus, delenie, umnojenie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setOnClickListeners();



        firstNumber = "Hello world";
        int v = 4;
        boolean bool = false;

        while (v < 20){
            v = v + 2;
        }
        textView.setText(String.valueOf(v));


    }

    private void setOnClickListeners(){

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = firstNumberEditText.getText().toString();
                secondNumber = secondNumberEditText.getText().toString();
                a = Integer.parseInt(firstNumber);
                b = Integer.parseInt(secondNumber);

                switch (v.getId()){
                    case R.id.minusButton:
                        c = a - b;
                        break;
                    case R.id.plusButton:
                        c = a + b;
                        break;
                    case R.id.delenieButton:
                        c = a / b;
                        break;
                    case R.id.umnojenieButton:
                        c = a * b;
                        break;
                }
                textView.setText(String.valueOf(c));
            }
        };




        plus.setOnClickListener(clickListener);

        minus.setOnClickListener(clickListener);

        delenie.setOnClickListener(clickListener);

        umnojenie.setOnClickListener(clickListener);

    }

    private void init() {
        plus = (Button)findViewById(R.id.plusButton);
        minus = (Button)findViewById(minusButton);
        umnojenie = (Button)findViewById(R.id.umnojenieButton);
        delenie = (Button)findViewById(R.id.delenieButton);
        textView = (TextView)findViewById(R.id.textView);
        firstNumberEditText = (EditText)findViewById(R.id.editText);
        secondNumberEditText = (EditText)findViewById(R.id.editText2);
    }

}

