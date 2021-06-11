package com.example.models;

public class Rating {
    private final String movieId;
    private final int rating;

    public Rating(final String movieId, final int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public int getRating() {
        return rating;
    }
}
