package com.luka.jobAppRest.repository;


import com.luka.jobAppRest.model.JobPost;

import java.util.List;

public interface JobRepository {
    List<JobPost> findAll();

    JobPost persist(JobPost jobPost);

    JobPost findById(int id);
}
