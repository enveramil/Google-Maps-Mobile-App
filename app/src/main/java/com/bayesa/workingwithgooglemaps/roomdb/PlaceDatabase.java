package com.bayesa.workingwithgooglemaps.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.bayesa.workingwithgooglemaps.model.Place;

@Database(entities = {Place.class}, version = 1)
public abstract class PlaceDatabase extends RoomDatabase {
    public abstract PlaceDao placeDao();
}
