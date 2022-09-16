package com.springboot.firstapp.Business;

import com.springboot.firstapp.Data.EmployeeDto;
import com.springboot.firstapp.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

//business logic
@Service
public class EmployeeService {
    private EmployeeRepository _employeeRepository;

    public EmployeeService()
    {

    }
    public EmployeeService(EmployeeRepository employeeRepository)
    {
        this._employeeRepository = employeeRepository;
    }
    public void addEmployee(EmployeeDto employeeDto)
    {
       _employeeRepository.save(employeeDto);
    }
}
