package com.example.pfbottom;

public class Upload {
    private String mName;
    private String mImageUrl;

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

    public String getQuantity() {
        return quantity;
    }

    public String getExp() {
        return exp;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
}
