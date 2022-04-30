package com.example.pfbottom;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class HomeFragment extends Fragment {

    Button btnEnterFreezer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        btnEnterFreezer = v.findViewById(R.id.btnEnterFreezer);

        btnEnterFreezer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFreezer();

            }
        });
        return v;

    }

// open freezer page
    private void openFreezer() {
        Intent i = new Intent(HomeFragment.this.getActivity(), Freezer.class);
        //Intent i = new Intent(getActivity(), Freezer.class);
      startActivity(i);
    }

}