package com.azlanjamal.basicdatabinding;

/**
 * Created by akmalazlan on 03/01/2018.
 */

public class DataSource {

    private String name;

    public static DataSource get(String name) {
        return new DataSource(name);
    }

    private DataSource(String name) {
        this.name = name;
    }

    public String getMessage() {
        return String.format("Hello, %s!", name);
    }
}
