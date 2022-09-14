package com.springboot.firstapp.Controllers;


import com.springboot.firstapp.Models.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    private static List<Employee> _employeesList= new ArrayList<>();
    @GetMapping("/getEmployee")
    public Employee getEmployee()
    {
        return new Employee("Bhanu", "Priya");
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee()
    {
        return _employeesList;
    }
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        _employeesList.add(employee);
        return employee;
    }
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        for(int i=0;i<_employeesList.size();i++)
        {
            if(employee.getId()==_employeesList.get(i).getId())
            {
                _employeesList.get(i).setFirstName(employee.getFirstName());
                _employeesList.get(i).setLastName(employee.getLastName());
                break;
            }
        }
        return employee;
    }
    @DeleteMapping("/delete/{id}")
    public Employee deleteEmployee(@PathVariable int id)
    {
        Employee result = _employeesList.get(id);
        return _employeesList.get(id);
    }

}
