package com.luka.jobAppRest.Service;

import com.luka.jobAppRest.model.JobPost;
import com.luka.jobAppRest.repository.JobRepository;
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
    public JobPost addJob(JobPost jobPost) {
       return jobRepository.persist(jobPost);
    }

    @Override
    public List<JobPost> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public JobPost getJob(int id) {
        return jobRepository.findById(id);
    }
}
