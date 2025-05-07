package com.luka.reviewms.review;

import java.util.List;

public interface ReviewService {
    Review findById(Long id);
    List<Review> findAll();
    boolean saveReview(Long companyId, Review review);
    boolean deleteReview(Long id);
}
