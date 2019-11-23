package com.example.android.quakereport;


public class EarthQuake {
    private int longitude;
    private int latitude;
    private String title;
    private String time;
    private String place;
    private double felt;

    public EarthQuake(double felt, String place, String time) {
        this.time = time;
        this.place = place;
        this.felt = felt;
    }

    public void setFelt(double felt) {
        this.felt = felt;
    }

    public double getFelt() {
        return felt;
    }

    public EarthQuake(double felt, int longitude, int latitude, String title, String time, String place) {
        this.felt = felt;
        this.longitude = longitude;
        this.latitude = latitude;
        this.title = title;
        this.time = time;
        this.place = place;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }
}
