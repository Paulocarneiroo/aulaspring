package com.aulamap.aulaspring.controllers;

import com.aulamap.aulaspring.dto.EmployeeDto;
import com.aulamap.aulaspring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping(value = "/{id}")
    public EmployeeDto findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping
    public Page<EmployeeDto> findAll(Pageable pageable){
        return service.findAll(pageable);
    }
}
