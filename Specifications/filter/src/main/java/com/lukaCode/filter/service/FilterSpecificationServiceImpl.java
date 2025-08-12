package com.lukaCode.filter.service;

import com.lukaCode.filter.model.RequestDto;
import com.lukaCode.filter.model.SearchRequestDto;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilterSpecificationServiceImpl<T> implements FilterSpecificationService<T> {

    @Override
    public Specification<T> getSearchSpecification(SearchRequestDto searchRequestDto) {
        return (root, query,criteriaBuilder)-> criteriaBuilder.equal(root.get(searchRequestDto.getColumn()), searchRequestDto.getValue());
    }

    @Override
    public Specification<T> getSearchSpecification(List<SearchRequestDto> searchRequestDtos, RequestDto.GlobalOperator globalOperator) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            for(var searchRequestDto : searchRequestDtos){
                var predicate =criteriaBuilder.equal(root.get(searchRequestDto.getColumn()), searchRequestDto.getValue());
                predicates.add(predicate);
            }

            if(globalOperator.equals(RequestDto.GlobalOperator.AND)){
                return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
            }else{
                return criteriaBuilder.or(predicates.toArray(new Predicate[0]));
            }

        };
    }
}
