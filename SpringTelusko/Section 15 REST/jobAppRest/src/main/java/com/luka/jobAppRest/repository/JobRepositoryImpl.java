package com.luka.jobAppRest.repository;

import com.luka.jobAppRest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepositoryImpl implements JobRepository {
    List<JobPost> jobs = new ArrayList<>(List.of(
            new JobPost(1, "Java Developer", "Develop enterprise-grade backend systems.", 3, List.of("Java", "Spring Boot", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Build responsive web applications.", 2, List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(3, "Data Scientist", "Analyze data and build ML models.", 4, List.of("Python", "Pandas", "Scikit-learn", "TensorFlow")),
            new JobPost(4, "DevOps Engineer", "Manage cloud infrastructure and CI/CD pipelines.", 3, List.of("AWS", "Docker", "Kubernetes", "Jenkins")),
            new JobPost(5, "Mobile App Developer", "Develop cross-platform mobile applications.", 2, List.of("Flutter", "Dart", "Firebase"))));
    private int lastPostId;

    @Override
    public List<JobPost> findAll() {
        return jobs;
    }

    @Override
    public JobPost persist(JobPost jobPost) {
        lastPostId=jobs.getLast().getPostId();
        int newPostId=lastPostId+1;
        jobPost.setPostId(newPostId);
        jobs.add(jobPost);
        return jobPost;
    }

    @Override
    public JobPost findById(int id) {
        for(JobPost job :jobs){
            if(job.getPostId()==id)return job;
        }
        return null;
    }
}
