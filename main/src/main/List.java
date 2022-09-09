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
public class List {

    void push(int i){}
    void pop(){}
    public class Node{
        int info;
        Node next;

        public Node() {
        }

        public Node(int info, Node next) {
            this.info = info;
            this.next = next;
        }

        public Node(int info) {
            this.info = info;
            next = null;
        }
    }
    
    Node head=null; 
    Node tail=null;
    void addBegin(int a){
        Node newNode  = new Node(a);
        if(head==null){
            head = newNode;
            tail = head;
        }else{
            newNode.next = head;
            head = newNode;
        }
        
    }
    void addEnd(int a){
        Node newNode  = new Node(a);
        if(head==null){
            head = newNode;
            tail = head;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public int getInfo(){
        if(head == null){
            System.out.println("head = null");
            return 0 ;
        }
        return head.info;
    }
    @Override
    public String toString() {
        String ot = " ";
        for(Node i = head;i != null;i = i.next){
            ot = ot + i.info + " "; 
        }
        return "List{" + ot + '}';
    }
    
    
}
