package com.luka.firstjobapp.review;

import java.util.List;

public interface ReviewService {
    Review findById(Long id);
    List<Review> findAll();
    Review saveReview(Review review);
    boolean deleteReview(Long id);
}
