package com.proj.mongoProject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "Hotels")
public class Hotel {

    @Id
    @Field(value="id")
    private String id;
    
    @Field(value="name")
    private String name;

    @Indexed(direction = IndexDirection.ASCENDING)
    @Field(value="pricePerNight")
    private int pricePerNight;
    
    @Field(value="address")
    private Address address;
    
    @Field(value="reviews")
    private List<Review> reviews;

    

    public Hotel() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public Address getAddress() {
        return address;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
