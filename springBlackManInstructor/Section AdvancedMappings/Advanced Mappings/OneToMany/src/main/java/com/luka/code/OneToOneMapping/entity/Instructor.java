package com.luka.code.OneToOneMapping.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="INSTRUCTOR")
@SequenceGenerator(name = "instructor_id_seq", sequenceName = "instructor_seq", allocationSize = 1)
public class Instructor {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "instructor_id_seq")
    private Integer id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="INSTRUCTOR_DETAIL_ID")
    private InstructorDetail instructorDetail;

    @OneToMany(mappedBy = "instructor", cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Course> courses;



    public Instructor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Instructor() {
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public InstructorDetail getInstructorDetail() {
        return instructorDetail;
    }

    public void setInstructorDetail(InstructorDetail instructorDetail) {
        this.instructorDetail = instructorDetail;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", instructorDetail=" + instructorDetail +
                '}';
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void add(Course course){
        if(courses==null){
            courses=new ArrayList<>();
        }
        courses.add(course);
        course.setInstructor(this);

    }
}