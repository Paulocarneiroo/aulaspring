package com.aulamap.aulaspring.services;
import com.aulamap.aulaspring.dto.EmployeeDto;
import com.aulamap.aulaspring.entities.Employee;
import com.aulamap.aulaspring.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Transactional(readOnly = true)
    public EmployeeDto findById(Long id){
        Optional<Employee> result = repository.findById(id);
        Employee entity = result.get();
        return new EmployeeDto(entity);
    }

    @Transactional(readOnly = true)
    public Page<EmployeeDto> findAll(Pageable pageable) {
        Page<Employee> result = repository.findAll(pageable);
        return result.map(x -> new EmployeeDto(x));
    }
}
