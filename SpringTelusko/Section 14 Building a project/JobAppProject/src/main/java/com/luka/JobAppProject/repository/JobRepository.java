package com.luka.JobAppProject.repository;

import com.luka.JobAppProject.model.JobPost;

import java.util.List;

public interface JobRepository {
    List<JobPost> findAll();

    void persist(JobPost jobPost);
}
