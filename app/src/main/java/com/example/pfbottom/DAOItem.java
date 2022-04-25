package com.example.pfbottom;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOItem {
    private DatabaseReference databaseReference;
    public DAOItem(){
        //FirebaseDatabse db = FirebaseDatabase.getInstance();
        //databaseReference = db.getReference(Item.class.getSimpleName());
    }
    public Task<Void> add(Item itm){

        return databaseReference.push().setValue(itm);
    }
}
