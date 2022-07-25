package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        /**
         * Instanziierung
         * Objektbildung
         * 
         * child = Referenzvariable
         * to rfer to --> verweisen auf ...
         * Child = Referenz (Typ <-> Klasse)
         * Child() = Aufruf des kontruktors
         * --> jier Default-Konstruktor aus der Klasse objekt
        **/        
        Child child = new Child();

        // Call()
        child.sayHello();
        // Parent parent = new Parent();

        // // Call()
        // parent.sayHello();

 
 
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

