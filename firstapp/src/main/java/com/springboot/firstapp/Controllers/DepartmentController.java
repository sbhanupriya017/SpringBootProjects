package com.springboot.firstapp.Controllers;

import com.springboot.firstapp.Data.DepartmentDto;
import com.springboot.firstapp.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    private DepartmentRepository _departmentRepository;
    @Autowired
    public DepartmentController(DepartmentRepository departmentRepository)
    {
        this._departmentRepository = departmentRepository;
    }
    @GetMapping("/getall")
    public List<DepartmentDto> getAllDepartment()
    {
      return _departmentRepository.findAll();
    }

    @PostMapping("/add")
    public DepartmentDto AddDepartment(@RequestBody DepartmentDto department)
    {
        _departmentRepository.save(department);
        return department;
    }
}
