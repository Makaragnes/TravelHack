package com.example.travelassistant.routings;

import android.media.Image;

public class ResursesForRoutings{
    String description;
    Image image;

    public Image getImage() {
        return image;
    }




    public ResursesForRoutings(String description, Image image){
        this.description = description;
        this.image = image;

    }

    public String getNameUnivers(){
        return description;
    }

    public void setNameUnivers(String description){
        this.description = description;
    }
}
