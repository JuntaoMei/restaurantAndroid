package com.laioffer.laiofferproject;

/**
 * Created by juntao on 10/26/16.
 */

import android.graphics.Bitmap;

import java.util.List;

/**
 * A class for restaurant, which contains all information of a restaurant.
 */
public class Restaurant {
    /**
     * All data for a restaurant.
     */
    private String name;
    private String address;



    private String type;
    private double lat;
    private double lng;
    private Bitmap thumbnail;
    private Bitmap rating;
    private List<String> categories;

    public double getStars() {
        return stars;
    }

    private double stars;


    /**
     * Constructor.
     */
    public Restaurant(
            String name,
            String address,
            String type,
            double lat,
            double lng,
            Bitmap thumbnail,
            Bitmap rating) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.lat = lat;
        this.lng = lng;
        this.thumbnail = thumbnail;
        this.rating = rating;
    }

    public Restaurant() {}

    /**
     * Getters for private attributes of Restaurant class.
     */
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getType() { return type; }
    public double getLat() { return lat; }
    public double getLng() { return lng; }
    public Bitmap getThumbnail() { return thumbnail; }
    public Bitmap getRating() { return rating; }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setThumbnail(Bitmap thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setRating(Bitmap rating) {
        this.rating = rating;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }
}