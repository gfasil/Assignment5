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
public class Professor extends DeptEmployee {
    
    int numberOfPublications; 
    public Professor(String name, double salary,  int numberOfPublications,int year,int month,int day) {
        super(name,salary,year,month,day);
        this.numberOfPublications=numberOfPublications;
    
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
    
    
}
