package com.example.pfbottom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Freezer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freezer);

        EditText edit_name = findViewById(R.id.edit_name);
        EditText edit_quantity = findViewById(R.id.edit_quantity);
        Button btn = findViewById(R.id.btn_submit);
        btn.setOnClickListener(v-> {

        });
    }
}