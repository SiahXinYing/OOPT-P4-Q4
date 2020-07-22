/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptp4;


public class CarType {
    private String make;
    private String model;
    private double capacity;
    String toString;


    public CarType(String make, String model, double capacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    public String toString() {
        return String.format("%10s %10s %10s",make,model,capacity);
    }
    
    
}
