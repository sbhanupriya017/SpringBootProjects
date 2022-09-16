package com.springboot.firstapp.Controllers;


import com.springboot.firstapp.Data.EmployeeDto;
import com.springboot.firstapp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private  EmployeeRepository _employeeRepository;
    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository)
    {
        this._employeeRepository = employeeRepository;
    }
    @GetMapping("/getbyid/{itemid}")
    public Optional<EmployeeDto> getEmployee(@PathVariable("itemid") Integer id)
    {
        return _employeeRepository.findById(id);
    }

    @GetMapping("/getall")
    public List<EmployeeDto> getAllEmployee()
    {
        return _employeeRepository.findAll();
    }
    @PostMapping("/add")
    public EmployeeDto addEmployee(@RequestBody EmployeeDto employee)
    {
        _employeeRepository.save(employee);
        return employee;
    }
    @PutMapping("/update")
    public EmployeeDto updateEmployee(@RequestBody EmployeeDto employee)
    {
        Optional<EmployeeDto> current = _employeeRepository.findById(employee.getId());
        if(current.isPresent())
        {
            EmployeeDto obj = current.get();
            obj.setAge(employee.getAge());
            obj.setDepartmentId(employee.getDepartmentId());
            obj.setName(employee.getName());
            _employeeRepository.save(obj);
        }
        return employee;
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id)
    {
         _employeeRepository.deleteById(id);
    }
}
