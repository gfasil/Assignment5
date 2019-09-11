/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.L5HW.Q3;

import java.io.PrintStream;

/**
 *
 * @author HP
 */
public class Driver {
    public static void main(String args[]){
    
    Figure u=new UpwardHat();
    Figure d=new DownwardHat();
    Figure f=new FaceMaker();
    Figure v=new Vertical();
    
   Figure[] figures={u,d,f,v};
    for(Figure fig:figures){
        System.out.print(fig.getFigure());  
        }
           
       
        for(Figure fig:figures){
        System.out.print("\n"+fig.getClass().getSimpleName()+": "+fig.getFigure());
        }
        
    }
}
