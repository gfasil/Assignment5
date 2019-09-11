/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.L5HW.Q2;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class DeptEmployee {
      String name;
    double salary;
    LocalDate hireDate ;
    
    public DeptEmployee(String name,double salary, int year,int month,int day){
        this.name=name;
       this.salary=salary;
       this.hireDate=LocalDate.of(year, month, day);
    
    }
    public void setName(String name) {
        this.name = name;
    }
   

    public void setHireDate(LocalDate hireDate) {
        this.hireDate =hireDate ;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
    public double computeSalary(){
    return getSalary();
    }
  
    
}
