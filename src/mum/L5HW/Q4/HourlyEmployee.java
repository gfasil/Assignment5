/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.L5HW.Q4;

/**
 *
 * @author HP
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public HourlyEmployee(double wage, double hour, String firstName, String lastName, String SocialSecurityNumber) {
        super(firstName, lastName, SocialSecurityNumber);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public double getHour() {
        return hour;
    }
    @Override
    public double getPayment() {
    return   getHour()*getWage();
    }

    @Override
    public String toString() {
        return super.toString() + "wage=" + wage + ", hour=" + hour + '}';
    }
    
}
