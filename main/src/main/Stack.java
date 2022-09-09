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
public class Stack extends List{
    
    @Override
    public void push(int i){
        addBegin(i);
    }
    @Override
    public void pop(){
        if(head != null){
            head = head.next;
        }
    }
}
