/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptp4;

public class Registration {
    
    static int currentRegNo = 1001;
    
    private int regNo;
    private Owner owner;
    private Car car;

    public Registration( Owner owner, Car car) {
        this.owner = owner;
        this.car = car;
        
        currentRegNo++;
    }
    
    public String toString(){
        return String.format("%10d,%s,%s",regNo,owner.toString(),car.toString());
    }
}
