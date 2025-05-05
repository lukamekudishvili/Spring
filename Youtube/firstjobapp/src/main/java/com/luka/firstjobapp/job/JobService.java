package com.luka.firstjobapp.job;

import java.util.List;

public interface JobService {

    List<Job>  findAll();
    void createJob(Job job);

    Job findById(Long id);

    int deleteJobById(Long id);
}
