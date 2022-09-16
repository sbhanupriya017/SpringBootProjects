package com.springboot.firstapp.Data;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeDto {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "age")
    private int age;

    @Column(name = "departmentId", nullable = false)
    private int departmentId;

    public EmployeeDto()
    {

    }
    public EmployeeDto(int id, String name, int age, int departmentId)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.departmentId = departmentId;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getDepartmentId()
    {
        return departmentId;
    }
    public void setDepartmentId(int departmentId)
    {
        this.departmentId = id;
    }
}
