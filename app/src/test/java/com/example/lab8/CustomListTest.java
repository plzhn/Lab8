package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Estevan", "SK");

        list.addCity(city);
        assertEquals(true, list.hasCity(city));
        assertEquals(1, list.getCount());

        //Check delete properly
        list.deleteCity(city);
        assertEquals(false,list.hasCity(city));
        assertEquals(0, list.getCount());

    }
    @Test
    public void countCitiesTest() {
        list = MockCityList();
        City city = new City("Estevan", "SK");

        list.addCity(city);
        assertEquals(1, list.countCities());

        City city2 = new City("Berlin", "New Hampshire");
        list.addCity(city2);
        assertEquals(2, list.countCities());

        list.deleteCity(city);
        assertEquals(1, list.countCities());

    }


}
