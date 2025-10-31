package com.example.lab08;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;



public class CustomTestList {
    public CustomList MockCityList() {
        CustomList list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        int listSize = list.getCount();
        list.add(new City("Estevan", "SK"));
        assertEquals(listSize + 1, list.getCount());
    }
}
