package com.example.lab8;

import java.util.Objects;

public class City implements Comparable<City>{

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City compare = (City) o;
        return city.equals(compare.city) &&
                province.equals(compare.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }


}
