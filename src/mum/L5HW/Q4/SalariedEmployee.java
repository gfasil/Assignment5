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
public class SalariedEmployee extends Employee {
   private double weeklySalary;

    public SalariedEmployee(double weeklySalary, String firstName, String lastName, String SocialSecurityNumber) {
        super(firstName, lastName, SocialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double getPayment() {
   
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return super.toString()+" weeklySalary=" + weeklySalary + '}';
    }
}
