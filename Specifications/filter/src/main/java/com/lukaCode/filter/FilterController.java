package com.lukaCode.filter;

import com.lukaCode.filter.domain.Student;
import com.lukaCode.filter.model.RequestDto;
import com.lukaCode.filter.repository.StudentRepository;
import com.lukaCode.filter.service.FilterSpecificationService;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filter")
@AllArgsConstructor
public class FilterController {

    private StudentRepository studentRepository;
    private FilterSpecificationService<Student> filterSpecificationService;


    @GetMapping("/{name}")
    public Student getStudentByName(@PathVariable String name) {
        return studentRepository.findByName(name);
    }

//    @PostMapping("/specification")
//    public List<Student> getStudents(){
//        Specification<Student> specification= (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("name"),"Luka");
//
//        return studentRepository.findAll(specification);
//    }

//    @PostMapping("/specification")
//    public List<Student> getStudents(@RequestBody RequestDto requestDto) {
//
//        var spec=filterSpecificationService.getSearchSpecification(requestDto.getSearchRequestDto());
//        return studentRepository.findAll(spec);
//    }

    @PostMapping("/specifications")
    public List<Student> getStudents(@RequestBody RequestDto requestDto) {

        var spec=filterSpecificationService.getSearchSpecification(requestDto.getSearchRequestDto(), requestDto.getGlobalOperator());
        return studentRepository.findAll(spec);
    }

}
