/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab.polimorfisme;

/**
 *
 * @author WINDOWS 10
 */
class VMMi {
    public void move(){
        System.out.println("Vehicle are used for moving from one place to another");
}
}

class Car extends VMMi {
    @Override
    public void move (){
        super.move();
        System.out.println("Car is a good medium of transport");
    }
}

public class Vehicle {
    public static void main (String args []){
        VMMi v = new Car ();
        v.move();
    }
}
