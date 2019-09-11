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
public class Scretary extends DeptEmployee {
    double overtimeHours;
    public Scretary(String name, double salary,double overtimeHours,int year,int month,int day) {
        super(name, salary,year,month,day);
        this.overtimeHours=overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }
    
    public double computeSalary(){
    
    return super.computeSalary()+(12*overtimeHours);
    }
    
}
