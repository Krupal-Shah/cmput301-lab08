package com.example.lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CustomList {
    private List<City> cities = new ArrayList<>();

    public <E> CustomList(Object o, ArrayList<E> es) {
    }


    /**
     * This adds a city to the list if the city does not exist
     *
     * @param city This is a candidate city to add
     */
    public void add(City city) {
//        if (cities.contains(city)) {
//            throw new IllegalArgumentException();
//        }
//        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     *
     * @return Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether a city is present in the cities list.
     *
     * @param city City
     * @return boolean (if city is present or not).
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Counts the number of cities in the list.
     *
     * @return integer: The number of cities.
     */
    public int getCount() {
        return cities.size();
    }

    /**
     * Checks if a city is present and deletes it from the list if found.
     *
     * @param city City
     */
    public void deleteCity(City city) {
        if (!cities.remove(city)){
            throw new IllegalArgumentException();
        }
    }
}
