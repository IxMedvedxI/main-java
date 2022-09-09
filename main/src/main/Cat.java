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
public class Cat extends Mammal{

    public Cat(String n, int age) {
        super(n, age);
    }

    Cat() {
        super();
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setAge(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void speak(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", age=" + age + '}';
    }
    
}

