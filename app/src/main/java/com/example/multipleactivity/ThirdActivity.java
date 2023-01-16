package com.example.multipleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        btn = findViewById(R.id.button3);
        Intent intent = new Intent(this, MainActivity.class);

        btn.setOnClickListener(v->{
            startActivity(intent);
        });

    }
}
