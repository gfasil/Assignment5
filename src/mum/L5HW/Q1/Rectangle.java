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
public  class Rectangle extends Shape {
	private final double width;
	private final double height;
	
	public Rectangle(String color,double width, double height) {
                super(color);
		this.height= height;
		this.width=width;
		}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	public double calculateArea() {
		
		return width*height;
	}
         public double calculatePerimeter(){
         
             return (2*getWidth())+(2*getHeight());
         }
         
	
}

