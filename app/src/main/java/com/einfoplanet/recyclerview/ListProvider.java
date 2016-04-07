package com.einfoplanet.recyclerview;

/**
 * Created by bridgelabz5 on 7/4/16.
 */
public class ListProvider {
    int image_id;
    String countryName,capitalName;

    public ListProvider(int image_id,String countryName,String capitalName){
        this.setCapitalName(capitalName);
        this.setCountryName(countryName);
        this.setImage_id(image_id);
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }
}
