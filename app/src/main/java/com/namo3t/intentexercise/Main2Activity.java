package com.namo3t.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView ResultText;
        ResultText = findViewById(R.id.ResultText);

        Intent intent = getIntent();
        String param_text = intent.getStringExtra("name");

        ResultText.setText(param_text);
    }
}
