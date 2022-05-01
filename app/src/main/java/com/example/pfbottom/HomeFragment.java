package com.example.pfbottom;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {

    Button btnEnterFreezer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Intent i = new Intent(getActivity(), AddFreezer.class);
        btnEnterFreezer = view.findViewById(R.id.btnEnterFreezer);

        btnEnterFreezer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  openFreezer();
                startActivity(i);
            }
        });
        return view;

    }

// open freezer page
    // private void openFreezer() {Intent i = new Intent(HomeFragment.this.getActivity(), AddFreezer.class);
    //  Intent i = new Intent(getContext(), AddFreezer.class);}

}