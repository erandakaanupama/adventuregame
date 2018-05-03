package com.eab;

import java.util.HashMap;
import java.util.Map;
import java.util.PrimitiveIterator;

public class Location {

    private final int id;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int id, String description) {
        this.id = id;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q",0);
    }

    public void addExit(String direction, int location){
        this.exits.put(direction,location);
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap< >(this.exits);
    }


}
