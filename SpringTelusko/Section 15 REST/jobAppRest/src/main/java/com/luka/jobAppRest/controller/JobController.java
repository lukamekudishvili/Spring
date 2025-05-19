package com.luka.jobAppRest.controller;

import com.luka.jobAppRest.Service.JobService;
import com.luka.jobAppRest.model.JobPost;
import com.luka.jobAppRest.repository.JobRepository;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {
    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService, JobRepository jobRepository) {
        this.jobService = jobService;
    }

    @GetMapping(path="/jobs", produces = "application/json")
    public ResponseEntity<List<JobPost>> viewJobs(){
        return new ResponseEntity<>(jobService.getAllJobs(), HttpStatus.OK);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<JobPost> viewJobById(@PathVariable("id") Long jobId){
        JobPost job=jobService.getJob(jobId);
        if(job==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(job, HttpStatus.OK);
    }

    @PostMapping(value = "/addJob",consumes = "application/xml")
    public ResponseEntity<JobPost> addJob(@RequestBody JobPost jobPost){

        return new ResponseEntity<>(jobService.addJob(jobPost),HttpStatus.OK);
    }

    @DeleteMapping("/deleteJob")
    public ResponseEntity<String> deleteJob(@RequestParam Long jobId){
        jobService.deleteJob(jobId);
        return new ResponseEntity<>("Deleted Successfully!",HttpStatus.OK);
    }

    @PostMapping("/jobs")
    public ResponseEntity<List<JobPost>> addJobs(@RequestBody List<JobPost> jobPosts){
        return new ResponseEntity<>(jobService.addJobs(jobPosts), HttpStatus.OK);
    }
}
