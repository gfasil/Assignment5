/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.L5HW.Q6.DeepClone;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String args[]) throws CloneNotSupportedException{
     Computer c1=new Computer("dell","intel", 8, 2.3);
     Person p1=new Person("Fasil",c1);
      Person p2=(Person)p1.clone();
      
      System.out.println("Original before cloning "+p1.toString());
      System.out.println("cloned object "+p2.toString());
      
      p2.setName("Henok");
      p2.getComputer().setManufacturer("HP");
      System.out.println("cloned object after change "+p2.toString());
       System.out.println("original object after change "+p1.toString());
    } 
}
