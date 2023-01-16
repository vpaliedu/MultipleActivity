package com.example.multipleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button btn;
    TextView output_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn = findViewById(R.id.button2);
        output_text = findViewById(R.id.textView2);
        output_text.setText("Eredmény: "+ MainActivity.valami);
        Intent intent = new Intent(this, ThirdActivity.class);


        btn.setOnClickListener(v->{
            startActivity(intent);
        });
    }
}
