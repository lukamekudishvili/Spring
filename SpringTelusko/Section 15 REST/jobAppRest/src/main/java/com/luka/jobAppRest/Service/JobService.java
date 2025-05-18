package com.luka.jobAppRest.Service;


import com.luka.jobAppRest.model.JobPost;

import java.util.List;

public interface JobService {
    JobPost addJob(JobPost jobPost);
    List<JobPost> getAllJobs();
    JobPost getJob(int id);
}
