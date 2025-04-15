package com.luka.code.OneToOneMapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="INSTRUCTOR_DETAIL")
@SequenceGenerator(name = "instructor_det_id_seq", sequenceName = "instructor_det_seq", allocationSize = 1)
public class InstructorDetail {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "instructor_det_id_seq")
    private Integer id;

    @Column(name="youtube_channel")
    private String youtube_channel;

    @Column(name="hobby")
    private String hobby;

    public InstructorDetail(String youtube_channel, String hobby) {
        this.youtube_channel = youtube_channel;
        this.hobby = hobby;
    }

    public InstructorDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYoutube_channel() {
        return youtube_channel;
    }

    public void setYoutube_channel(String youtube_channel) {
        this.youtube_channel = youtube_channel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "InstructorDetail{" +
                "id=" + id +
                ", youtube_channel='" + youtube_channel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}