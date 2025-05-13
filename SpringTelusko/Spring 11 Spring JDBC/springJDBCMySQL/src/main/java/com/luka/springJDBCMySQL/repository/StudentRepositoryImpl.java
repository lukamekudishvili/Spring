package com.luka.springJDBCMySQL.repository;

import com.luka.springJDBCMySQL.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int save(Student student) {
        String sql = "INSERT INTO student (id, first_name, last_name, email) values(?,?,?,?)";


        return jdbcTemplate.update(sql, student.getId(),
                student.getFirstName(), student.getLastName(), student.getEmail());
    }

    @Override
    public List<Student> findAll() {
        String sql = "select * from student";

        RowMapper<Student> mapper = ((rs, rowNum) ->
        {
            Student tempStudent = new Student();
            tempStudent.setId(rs.getInt("id"));
            tempStudent.setFirstName(rs.getString("first_name"));
            tempStudent.setLastName(rs.getString("last_name"));
            tempStudent.setEmail(rs.getString("email"));

            return tempStudent;
        });
        return jdbcTemplate.query(sql, mapper
        );
    }

    @Override
    public int deleteById(int id) {
        String sql="delete from student where id=?";
        int result=jdbcTemplate.update(sql,id);
        System.out.println("Delete status: "+result);
         return result;
    }
}
