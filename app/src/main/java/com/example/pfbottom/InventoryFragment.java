package com.example.pfbottom;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class InventoryFragment extends Fragment {
    Button btnAddFreezer;
    Button btnAddFridge;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inventory, container, false);
        btnAddFreezer = view.findViewById(R.id.btnAddFreezer);
        btnAddFridge = view.findViewById(R.id.btnAddFridge);

        btnAddFreezer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AddFreezer.class);


                startActivity(i);

            }
        });
        btnAddFridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AddFridge.class);


                startActivity(i);

            }
        });        return view;
    }
}
