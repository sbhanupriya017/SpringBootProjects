package com.springboot.firstapp.Models;

public class Employee {
    private static int _count=0;
    private String _firstname;
    private String _lastname;
    private int _id;

    public Employee()
    {
    }
    public Employee(String firstname, String lastname)
    {
        this._firstname = firstname;
        this._lastname = lastname;
        this._id = _count++;
    }
    public String getFirstName()
    {
        return _firstname;
    }
    public String getLastName()
    {
        return _lastname;
    }
    public void setFirstName(String firstName)
    {
        this._firstname = firstName;
    }
    public void setLastName(String lastName)
    {
        this._lastname = lastName;
    }
    public int getId()
    {
        return _id;
    }

//    public void setId(int id)
//    {
//        _id = id;
//    }

}
