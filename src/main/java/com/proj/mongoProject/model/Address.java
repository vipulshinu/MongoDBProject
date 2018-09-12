package com.proj.mongoProject.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Address {

    @Field(value="city")
	private String city;
    
    @Field(value="country")
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
