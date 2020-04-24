package com.namo3t.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSendData;
        btnSendData = findViewById(R.id.btnSendData);

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent destination = new Intent(MainActivity.this,Main2Activity.class); //From start to final
                destination.putExtra("name","Prayuth");
                startActivity(destination);

            }
        });
    }



}
