package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView01;
    TextView textView02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView01=findViewById(R.id.textView01);
        textView02 = findViewById(R.id.textView02);

        textView01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //line 26 to 28 is send value to the modactivity (format)
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });
        textView02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", 2);
                startActivity(intent);
            }
        });
    }
}