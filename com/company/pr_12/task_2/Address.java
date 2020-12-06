package com.company.pr_12.task_2;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;


    public void setAddress1(String address) {
        String[] partsOfAddress = address.split(",");
        this.country = partsOfAddress[0];
        this.region = partsOfAddress[1];
        this.city = partsOfAddress[2];
        this.street = partsOfAddress[3];
        this.house = partsOfAddress[4];
        this.building = partsOfAddress[5];
        this.flat = partsOfAddress[6];
    }

    public void setAddress2(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        String[] partsOfAddress = new String[7];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            partsOfAddress[i] = token;
            i++;
        }
        this.country = partsOfAddress[0];
        this.region = partsOfAddress[1];
        this.city = partsOfAddress[2];
        this.street = partsOfAddress[3];
        this.house = partsOfAddress[4];
        this.building = partsOfAddress[5];
        this.flat = partsOfAddress[6];
    }

    @Override
    public String toString() {
        return "Address: " +
                "country - " + country +
                ", region - " + region +
                ", city - " + city +
                ", street - " + street +
                ", house - " + house +
                ", building - " + building +
                ", flat - " + flat;
    }
}
