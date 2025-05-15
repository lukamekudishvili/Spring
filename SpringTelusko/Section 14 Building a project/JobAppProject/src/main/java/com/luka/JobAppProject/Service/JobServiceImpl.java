package com.luka.JobAppProject.Service;

import com.luka.JobAppProject.model.JobPost;
import com.luka.JobAppProject.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    @Autowired
    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public void addJob(JobPost jobPost) {
        jobRepository.persist(jobPost);
    }

    @Override
    public List<JobPost> getAllJobs() {
        return jobRepository.findAll();
    }
}
