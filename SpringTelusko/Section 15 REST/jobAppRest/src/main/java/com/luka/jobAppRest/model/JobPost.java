package com.luka.jobAppRest.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Component
@Data
@SequenceGenerator(name = "jobPostSequence", sequenceName = "EMP_SEQ",allocationSize = 1)
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "jobPostSequence")
    private Long postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
//    private List<String> postTechStack;

    public JobPost() {
    }

    public JobPost(Long postId, String postProfile, String postDesc, int reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
    }

}
