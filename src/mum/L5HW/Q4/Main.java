/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.L5HW.Q4;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String args[]){
    
    Employee ce=new ComissionEmployee(2000,0.4,"Fasil","Girma","34958");
     Employee ce1=new ComissionEmployee(3000,0.5,"Robi","Haile","4059594");
     Employee bce=new BasePlusComissionEmployee(300.0,2000.0,0.4,"Kaleb","zenawi","236464");
     Employee we=new SalariedEmployee(3000,"hewan","meles","303949");
    Employee we1=new SalariedEmployee(4000,"nathan","john","253564");
    
    Employee employees[]={ce,ce1,bce,we,we1};
    double salarySum=0;
    for(Employee emp:employees)
    {
      salarySum+=emp.getPayment();
      System.out.println(emp.toString());
   
    }
     System.out.println(" Total Salary of Employees: "+ salarySum);
    }
}
