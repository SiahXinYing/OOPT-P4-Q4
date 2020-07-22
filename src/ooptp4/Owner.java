/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptp4;

/**
 *
 * @author USER
 */
public class Owner {

   private String name;
   private int numIC;
   
   public Owner(String name, int numIC){
      this.name = name;
      this.numIC = numIC;
   }

    
    public String toString() {
        return String.format("%15s %15s",name,numIC);
    }
   
 
}
