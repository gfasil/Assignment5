/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.L5HW.Q1;
import java.lang.reflect.*;
import java.util.Arrays;
/**
 *
 * @author HP
 */
public class TestShape {
    
    public static void main(String args[]){
   
        Shape circle1= new Circle("red",1.0);
        Shape circle2= new Circle("red",1.0);
        Shape rectangle1= new Rectangle("red",10.3,5.3);
        Shape rectangle2= new Rectangle("blue",1.0,1.0);
        Shape square= new Square("blue",1.0);
        Shape shapes[]={circle1,circle2,rectangle1,rectangle2,square};
        printTotal(shapes);
       
        
        
     }
     public static void printTotal(Shape[] input)
 { // Implement your code
     double areaSum=0;
     
        double perimeterSum=0;
     for(Shape sp:input){
            areaSum+=sp.calculateArea();
            perimeterSum+=sp.calculatePerimeter();
            
     }   
  System.out.println("Total area ="+  areaSum +"\n" +"Total permimeter ="+ perimeterSum);
  
 }
    
}
