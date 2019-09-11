/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.L5HW.Q1;

/**
 *
 * @author HP
 */
public final class Circle extends Shape {
	private final double radius;
	
	
	public Circle(String color,double radius) {
		
            super(color);
            this.radius=radius;
		
		
		
	}
	
	public double getRadius() {
		return radius;
	}

	public double calculateArea() {
		
		return Math.PI*Math.pow(this.radius, 2) ;
	}
        public double calculatePerimeter(){
        
            return 2*Math.PI*getRadius();
        }
	
}
