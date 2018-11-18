package com.example.user.beeradveser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrand(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        if (color.equals("light")) {
            brands.add("Bud");
            brands.add("Corona");
        }
        if (color.equals("brown")) {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        else {
            brands.add("Be Like a beer");
        }
        return brands;
    }
}