package com.example.dto;

import com.example.models.Rating;

import java.util.List;

public class UserRatings {
    private List<Rating> ratings;

    public UserRatings(final List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Rating> getRatings() {
        return ratings;
    }
}
