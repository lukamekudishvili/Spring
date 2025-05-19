package com.luka.jobAppRest.repository;


import com.luka.jobAppRest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<JobPost, Long> {

}
