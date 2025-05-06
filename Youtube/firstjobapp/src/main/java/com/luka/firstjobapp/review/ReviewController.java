package com.luka.firstjobapp.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies/{companyId}")
public class ReviewController {
    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/getAllReviews")
    public ResponseEntity<List<Review>> getReviews(){
        return new ResponseEntity<>(reviewService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getReview/{id}")
    public ResponseEntity<Review> getReview(@PathVariable Long id){
        Review review=reviewService.findById(id);
        if(review!=null){
            return new ResponseEntity<>(review, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/save")
    public ResponseEntity<Review> saveReview(@RequestBody Review review){
        Review savedReview=reviewService.saveReview(review);
        return new ResponseEntity<>(savedReview,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteReview(Long id){
        boolean deleted= reviewService.deleteReview(id);
        if(deleted){
            return new ResponseEntity<>("Review successfully deleted!", HttpStatus.OK);
        }
        return new ResponseEntity<>("Review not found to delete", HttpStatus.NOT_FOUND);
    }


}
