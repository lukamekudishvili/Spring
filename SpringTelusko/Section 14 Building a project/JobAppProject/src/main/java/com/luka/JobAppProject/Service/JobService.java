package com.luka.JobAppProject.Service;

import com.luka.JobAppProject.model.JobPost;

import java.util.List;

public interface JobService {
    void addJob(JobPost jobPost);
    List<JobPost> getAllJobs();
}
