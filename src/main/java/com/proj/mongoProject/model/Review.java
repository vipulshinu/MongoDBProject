package com.proj.mongoProject.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Review {

    @Field(value="userName")
	private String userName;
    
    @Field(value="rating")
    private int rating;
    
    @Field(value="approved")
    private boolean approved;



    public Review(String userName, int rating, boolean approved) {
        this.userName = userName;
        this.rating = rating;
        this.approved = approved;
    }

    public String getUserName() {
        return userName;
    }

    public int getRating() {
        return rating;
    }

    public boolean isApproved() {
        return approved;
    }
}
