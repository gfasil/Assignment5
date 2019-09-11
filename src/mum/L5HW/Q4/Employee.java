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
public abstract class Employee {
   private String firstName;
    private String lastName;
    private String SocialSecurityNumber;
    
    public abstract double getPayment();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public Employee(String firstName, String lastName, String SocialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", SocialSecurityNumber=" + SocialSecurityNumber ;
    }
    
}
