package com.example.currencycoverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextInr ,mEditTextDollar ;
    public void onConverToInrClick(View view){
        String amountInDollar = mEditTextDollar.getText().toString();
        Double amountInDollarDouble =Double.parseDouble(amountInDollar);
        Double amountInINR = amountInDollarDouble *79.880;
        mEditTextInr.setText("INR is "+amountInINR);

    }

    public void onConvertToDollarClick(View view){
        String amountInINR = mEditTextInr.getText().toString();
        Double amountInDollarDouble =Double.parseDouble(amountInINR);
        Double amountINDollar = amountInDollarDouble /79.880;
        mEditTextDollar.setText("$ is "+amountINDollar);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditTextInr = findViewById(R.id.editTextInr);
        mEditTextDollar= findViewById(R.id.editTextDollar);

    }
}