package com.luka.firstjobapp.job.impl;

import com.luka.firstjobapp.job.Job;
import com.luka.firstjobapp.job.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class JobServiceImpl implements JobService {
    private List<Job> jobs = new ArrayList<>(List.of(
            new Job(1L, "Software Engineer", "Develop and maintain web applications.",
                    "70000", "100000", "San Francisco, CA"),
            new Job(2L, "Data Analyst", "Analyze business data and generate reports.",
                    "60000", "85000", "Chicago, IL"),
            new Job(3L, "Project Manager", "Oversee project timelines and deliverables.",
                    "80000", "110000", "Boston, MA")
    ));

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        int id = jobs.size() + 1;
        job.setId((long) id);
        jobs.add(job);
    }

    @Override
    public Job findById(Long id) {
        for(Job job : jobs){
            if(Objects.equals(job.getId(), id))return job;
        }
        return null;
    }

    @Override
    public int deleteJobById(Long id) {
        for(Job job : jobs){
            if(Objects.equals(job.getId(), id)){
                jobs.remove(job);
                return 1;
            };
        }
        return 0;
    }
}
