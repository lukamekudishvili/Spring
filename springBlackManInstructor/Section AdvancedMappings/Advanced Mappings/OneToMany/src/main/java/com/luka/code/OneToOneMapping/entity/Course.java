package com.luka.code.OneToOneMapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="COURSE")
@SequenceGenerator(name = "course_id_seq", sequenceName = "course_seq",allocationSize = 1)
public class Course {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_id_seq")
    private Integer id;

    @Column(name = "TITLE")
    private String title;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    public Course() {
    }

    public Course(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\''+
                '}';
    }


}
