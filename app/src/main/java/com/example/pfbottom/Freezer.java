package com.example.pfbottom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Freezer extends AppCompatActivity {
    // initiate
    EditText edit_name;
    EditText edit_quantity;
    Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freezer);

        //
        edit_name = findViewById(R.id.edit_name);
        edit_quantity = findViewById(R.id.edit_quantity);
        btnEnter = findViewById(R.id.btnEnter);

        // button event handler on click
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insertItemData();
            }
        });
    }

// add to database
    private void insertItemData() {

        String name = edit_name.getText().toString();
        String quantity = edit_quantity.getText().toString();

        Item item = new Item(name, quantity);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference itemDbRef= database.getReference("freezer");
        itemDbRef.push().setValue(item);

        //message if worked
        Toast.makeText(Freezer.this,"Item entered!",Toast.LENGTH_SHORT).show();
    }
}