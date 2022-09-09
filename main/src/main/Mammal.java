/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Netbeans
 */
public abstract class Mammal {
    String name;
    int age;

    public Mammal() {
    }
    
    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mammal{" + "name=" + name + ", age=" + age + '}';
    }
    
   abstract public void speak();
    
}
