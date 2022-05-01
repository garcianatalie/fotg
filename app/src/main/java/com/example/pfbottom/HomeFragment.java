package com.example.pfbottom;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {

    Button btnEnterFreezer, btnEnterFridge;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        btnEnterFreezer = view.findViewById(R.id.btnEnterFreezer);
        btnEnterFridge = view.findViewById(R.id.btnEnterFridge);

        btnEnterFreezer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InsideFreezer.class);
                startActivity(intent);
            }
        });
        btnEnterFridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InsideFridge.class);
                startActivity(intent);
            }
        });
        return view;

    }

// open freezer page
    // private void openFreezer() {Intent i = new Intent(HomeFragment.this.getActivity(), AddFreezer.class);
    //  Intent i = new Intent(getContext(), AddFreezer.class);}

}