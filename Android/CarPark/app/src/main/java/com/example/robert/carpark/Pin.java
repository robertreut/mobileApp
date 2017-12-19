package com.example.robert.carpark;


/**
 * Created by Robert on 08.12.2017.
 */

public class Pin {
    String Locality;
    Double Longitude;
    Double Latitude;
    Boolean Occupied;
    String Address;


    public void setAddress(String address) {
        Address = address;
    }

    public Boolean getOccupied() {
        return Occupied;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public String getLocality() {
        return Locality;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public void setLocality(String locality) {
        this.Locality = locality;
    }

    public void setLongitude(Double longitude) {
        this.Longitude = longitude;
    }

    public String getAddress() {
        return Address;
    }

    public void setOccupied(Boolean occupied) {
        Occupied = occupied;
    }

}
