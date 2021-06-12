package com.example.controller;

import com.example.dto.UserRatings;
import com.example.models.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratingData")
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") final String movieId) {
        return new Rating(movieId, 5);
    }

    @GetMapping("/user/{userId}")
    public UserRatings getUserRatings(@PathVariable("userId") final String userId) {
        List<Rating> ratings = List.of(new Rating("550", 4), new Rating("551", 5),
                new Rating("552", 3));
        return new UserRatings(ratings);
    }
}
