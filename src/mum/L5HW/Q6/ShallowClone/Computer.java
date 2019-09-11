/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.L5HW.Q6.ShallowClone;

/**
 *
 * @author HP
 */
class Computer implements Cloneable {
    
 private  String manufacturer;
 private String processor;
 private int ramSize;
 private double processorSpeed;

    public Computer(String manufacturer,String processor, int ramSize, double processorSpeed) {
        this.manufacturer=manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public String getProcessor() {
        return processor;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }
    public double computePower()
    {
    return getRamSize()*getProcessorSpeed();
    }

    @Override
    public String toString() {
        return "manufacturer= " + manufacturer + ", processor= " + processor + ", ramSize= " + ramSize + ", processorSpeed= " + processorSpeed ;
    }
    @Override
    public boolean equals(Object pc){
    if(pc==null) return false;
  //  if(!(pc instanceof Computer)) return false;
  if((this.getClass()!=pc.getClass())) return false;
   
    
    Computer c=(Computer) pc;
     boolean isequals=c.manufacturer.equals(manufacturer) && c.processor.equals(processor)
     && c.processorSpeed==processorSpeed && c.ramSize==ramSize;
        return isequals;
    }
    
    
   @Override
   public int hashCode(){
       
       int hash=3;
       
       hash+= manufacturer.hashCode()+processor.hashCode()+ (int) ramSize;
       long temp=Double.doubleToRawLongBits(processorSpeed);
       hash+= (int) (temp ^(temp>>>32));
       return hash;
            
   
   }
   
   public Object clone() throws CloneNotSupportedException{
    
    Computer clone=(Computer) super.clone();
    return clone;
   }
    
   
   
    
 
}
