/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee;

/**
 *
 * @author apere
 */

public class Employee {
    private int employeeId;
    private String employeeName;
    private String email;
    
    //constructor
    public Employee(int employeeId, String employeeName, String email) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
    }
    

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
