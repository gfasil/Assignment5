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
public class Person implements Cloneable{
    String name;
    Computer computer;

    public String getName() {
        return name;
    }

    public Person(String name, Computer computer) {
        this.name = name;
        this.computer = computer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", computer=" + computer;
    }
    public Object clone() throws CloneNotSupportedException{
    
    Person clone=(Person) super.clone();
    clone.computer=(Computer) this.computer.clone();
    return clone;
    }
   
    
    
}
