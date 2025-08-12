package com.lukaCode.filter.service;

import com.lukaCode.filter.model.RequestDto;
import com.lukaCode.filter.model.SearchRequestDto;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface FilterSpecificationService<T> {
    Specification<T> getSearchSpecification(SearchRequestDto spec);

    Specification<T> getSearchSpecification(List<SearchRequestDto> searchRequestDtos, RequestDto.GlobalOperator globalOperator);


}
