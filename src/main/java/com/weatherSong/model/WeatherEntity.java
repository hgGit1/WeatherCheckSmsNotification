package com.weatherSong.model;

public class WeatherEntity {
    private Location LocationObject;
    private Current CurrentObject;


    // Getter Methods

    public Location getLocation() {
        return LocationObject;
    }

    public Current getCurrent() {
        return CurrentObject;
    }

    // Setter Methods

    public void setLocation(Location locationObject) {
        this.LocationObject = locationObject;
    }

    public void setCurrent(Current currentObject) {
        this.CurrentObject = currentObject;
    }

}
