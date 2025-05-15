package com.luka.JobAppProject.repository;

import com.luka.JobAppProject.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepositoryImpl implements JobRepository {
    List<JobPost> jobs=new ArrayList<>();

    @Override
    public List<JobPost> findAll() {
        return jobs;
    }

    @Override
    public void persist(JobPost jobPost) {
        jobs.add(jobPost);
    }
}
