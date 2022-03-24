package com.bayesa.workingwithgooglemaps.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Place {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "place_name")
    public String placeName;

    @ColumnInfo(name = "latitude")
    public Double latitude;

    @ColumnInfo(name = "longitude")
    public Double longitude;

    // Constructor
    public Place(String placeName, Double latitude, Double longitude){
        this.placeName = placeName;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
