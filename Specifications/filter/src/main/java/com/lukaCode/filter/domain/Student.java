package com.lukaCode.filter.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name="address_id", referencedColumnName = "id")
    private Address address;

    @JsonManagedReference
    @OneToMany(mappedBy = "studentId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Subject> subjects;
}
