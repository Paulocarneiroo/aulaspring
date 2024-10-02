package com.aulamap.aulaspring.dto;

import com.aulamap.aulaspring.entities.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class EmployeeDto {
    private Long id;
    private String name;
    private String email;
    private Double salary;

    public EmployeeDto(Employee entity){
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        salary = entity.getSalary();
    }
}
