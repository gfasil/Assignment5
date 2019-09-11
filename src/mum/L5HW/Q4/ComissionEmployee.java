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
public class ComissionEmployee extends Employee {
    private double grossSales;
    private double commisionRate;

    public ComissionEmployee(double grossSales, double commisionRate, String firstName, String lastName, String SocialSecurityNumber) {
        super(firstName, lastName, SocialSecurityNumber);
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }
    @Override
    public double getPayment() {
        return getGrossSales()*getCommisionRate();
          }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    @Override
    public String toString() {
        return super.toString()+"grossSales=" + grossSales + ", commisionRate=" + commisionRate + '}';
    }

   
    
}
