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
public class Qeue extends List{
    
    
    @Override
    public void push(int i){
        addEnd(i);
    }
    @Override
    public void pop(){
        head = head.next;
    }
}
