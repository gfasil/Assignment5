/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.L5HW.Q5;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String args[]){
        
        Computer c1=new Computer("dell","intel", 8, 2.3);
        Computer c2=new Computer("dell","intel", 8, 2.3);
          Computer c3=new Computer("hp","intel", 8, 2.3);
      
        Computer c4=c2;
      boolean isEqual= c1.equals(c2);
       boolean isEqual1= c3.equals(c2);
        boolean isEqual2= c3.equals(c4);
      System.out.println("c1.equals(c2): "+isEqual);
      System.out.println("c3.equals(c4): "+isEqual2);
      System.out.println("c3.equals(c2): "+isEqual1);
       
    }
}
