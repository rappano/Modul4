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
class parent{
    int x=5;
    public void Info(){
        System.out.println("Ini class parent");
    }
}

class Child extends parent{
    int x=10;
    @Override
    public void Info(){
        super.Info();
        System.out.println("Ini class child");
    }
}

public class BABPOLIMORFISME {
    public static void main(String[] args) {
        // TODO code application logic here
        Child tes = new Child();
        System.out.println("Nilai x ="+tes.x);
        tes.Info();
    }
    
}
