package com.example.piyush.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int value = 0;
    public void func(View v){
        EditText editText = (EditText)findViewById(R.id.editText);
        String text = editText.getText().toString();
        int value = Integer.parseInt(text);
        value = value * 75;
        Toast.makeText(this, "The value in Rupees is "+value, Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
