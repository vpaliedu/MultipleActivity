package com.example.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText txt;
    public static String valami;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, SecondActivity.class);
        btn =findViewById(R.id.button);
        txt = findViewById(R.id.editText);
        btn.setOnClickListener(v->{
            valami = txt.getText().toString();
            startActivity(intent);
        });
    }
}