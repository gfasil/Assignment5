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
public class BasePlusComissionEmployee extends ComissionEmployee {
    private double baseSalary;

    public BasePlusComissionEmployee(double baseSalary, double grossSales, double commisionRate, String firstName, String lastName, String SocialSecurityNumber) {
        super(grossSales, commisionRate, firstName, lastName, SocialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    

    public double getBaseSalary() {
        return baseSalary;
    }

    

    @Override
    public double getPayment() {
         return getBaseSalary()*super.getPayment();
    }
    
    public String toString(){
    return super.toString()+"base salary: "+getBaseSalary();
    }
}
