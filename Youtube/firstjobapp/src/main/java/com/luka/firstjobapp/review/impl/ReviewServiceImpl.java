package com.luka.firstjobapp.review.impl;

import com.luka.firstjobapp.review.Review;
import com.luka.firstjobapp.review.ReviewRepository;
import com.luka.firstjobapp.review.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review findById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public boolean deleteReview(Long id) {
        if(reviewRepository.existsById(id)){
            reviewRepository.deleteById(id);
            return true;
        }
        return false;

    }
}
