package com.example.pfbottom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MoreFragment extends Fragment {

    EditText edit_name;
    EditText edit_quantity;
    Button btnEnter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v = inflater.inflate(R.layout.fragment_more, container, false);

        edit_name = v.findViewById(R.id.edit_name);
        edit_quantity = v.findViewById(R.id.edit_quantity);
        btnEnter = v.findViewById(R.id.btnEnter);

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                insertItemData();
            }
        });
        return v;
    }

    private void insertItemData() {

        String name = edit_name.getText().toString();
        String quantity = edit_quantity.getText().toString();

        Item item = new Item(name, quantity);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference itemDbRef= database.getReference("freezer");
        itemDbRef.push().setValue(item);

        Toast.makeText(MoreFragment.this.getActivity(),"Item entered!",Toast.LENGTH_SHORT).show();
    }
}