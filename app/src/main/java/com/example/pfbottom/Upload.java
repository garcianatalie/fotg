package com.example.pfbottom;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mImageUrl;



    private String mKey;



    //added
    private String quantity;
    private String exp;

    public Upload() {
        //empty constructor needed
    }

    public Upload(String name, String quantity, String exp, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No Name";
        }

        mName = name;
        mImageUrl = imageUrl;

        //added
        this.quantity = quantity;
        this.exp = exp;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    //added
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String key) {
        mKey = key;
    }
}
