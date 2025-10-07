package com.lukacode.database.database_demo.jdbc;

import com.lukacode.database.database_demo.domain.Person;
import org.hibernate.internal.build.AllowNonPortable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDAO {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonJdbcDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public PersonJdbcDAO() {
    }

    //select * from person
    public List<Person> findAll(){
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<>(Person.class));
    }

    //select * from person where id=?
    public Person findById(int personId){
        return jdbcTemplate.queryForObject("select * from person where id=?",
                new Object[]{personId},
                new BeanPropertyRowMapper<>(Person.class));
    }
}
