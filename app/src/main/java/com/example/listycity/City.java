package com.example.listycity;

public class City {
    private String cityName;
    public City(String city_name) {
        this.cityName = city_name;
    }

    public String getName() {
        return cityName;
    }

    public void setName(String newName) {
        this.cityName = newName;
    }
}
