package com.springboot.firstapp.Data;

import javax.persistence.*;

@Entity
@Table(name ="Department")
public class DepartmentDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, name = "horizontal")
    private String horizontal;

    @Column(nullable = false, name ="vertical")
    private String vertical;

    public DepartmentDto()
    {

    }
    public DepartmentDto(int id, String horizontal, String vertical)
    {
        this.id = id;
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public int getId()
    {
        return id;
    }
    public String getHorizontal()
    {
        return horizontal;
    }
    public String getVertical()
    {
        return vertical;
    }
    public void setHorizontal(String horizontal)
    {
        this.horizontal = horizontal;
    }
    public void setVertical(String vertical)
    {
        this.vertical = vertical;
    }
}

