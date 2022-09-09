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
public class Main {public Cat cat = new Cat("Peta",5);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        Mammal cat = new  Dog("Kata",2);
        List integ = new List();
        List integnul = new List();
        cat.speak();
        //System.out.println(cat);
        //Main m = new Main();
        //System.out.println(m.cat);
        //System.out.println(cat);
        //integ.addBegin(5);
        //integ.addBegin(6);
        //integ.addEnd(4);
        
        //System.out.println(integ);
        //System.out.println(integnul);
        
        List st = new Stack();
        List q = new Qeue();
        st.push(2);
        st.push(4);
        System.out.println(st.getInfo());
        st.pop();
        System.out.println(st.getInfo());
        st.pop();
        System.out.println(st.getInfo());
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q);
        q.pop();
        System.out.println(q);
    }
    
}
