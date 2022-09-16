package com.springboot.firstapp.Repository;

import com.springboot.firstapp.Data.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDto, Integer> {
}
