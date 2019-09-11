/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.L5HW.Q2;


import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MainTest {
    public static void main(String[] args){
    
    DeptEmployee[] department = new DeptEmployee[5];
    department[0]=new Scretary("helen",3000.00,9,1994,12,12);
    department[1]=new Scretary("feven",4000.00,9,1994,12,12);
    department[2]=new Professor("marsila",6000.00,9,1994,12,12);
    department[3]=new Professor("renuka",3000.00,9,1994,12,12);
    department[4]=new Professor("yun-yuu",100000.00,9,1994,12,12);
        System.out.println("Choose your Choice :");
        Scanner in = new Scanner(System.in);
	String choice = in.nextLine().toUpperCase();
        if(choice.equalsIgnoreCase("y"))  printTotal(department);
                
	
    }
     public static void printTotal(DeptEmployee[] input)
 { // Implement your code
     double salarySum=0;
     for(DeptEmployee sp:input){
            salarySum+=sp.computeSalary();
          
 } 
  System.out.println("Total salary ="+  salarySum );
 }
}
