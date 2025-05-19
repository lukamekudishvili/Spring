package com.luka.jobAppRest.Service;


import com.luka.jobAppRest.model.JobPost;

import java.util.List;

public interface JobService {
    JobPost addJob(JobPost jobPost);
    List<JobPost> addJobs(List<JobPost> jobPosts);
    List<JobPost> getAllJobs();
    JobPost getJob(Long id);
    void deleteJob(Long id);
}


/*List<JobPost> jobs = new ArrayList<>(List.of(
            new JobPost(1, "Java Developer", "Develop enterprise-grade backend systems.", 3, List.of("Java", "Spring Boot", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Build responsive web applications.", 2, List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(3, "Data Scientist", "Analyze data and build ML models.", 4, List.of("Python", "Pandas", "Scikit-learn", "TensorFlow")),
            new JobPost(4, "DevOps Engineer", "Manage cloud infrastructure and CI/CD pipelines.", 3, List.of("AWS", "Docker", "Kubernetes", "Jenkins")),
            new JobPost(5, "Mobile App Developer", "Develop cross-platform mobile applications.", 2, List.of("Flutter", "Dart", "Firebase"))));*/
