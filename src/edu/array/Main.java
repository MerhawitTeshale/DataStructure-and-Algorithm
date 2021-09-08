package edu.array;

public class Main {

    public static void main (String [] args){

        Array numbers= new Array(3);
        numbers.insert(23);
        numbers.insert(21);
        numbers.insert(24);
        numbers.insert(40);
        numbers.removeAt(3);
        numbers.insert(34);
        System.out.println("index of "+numbers.indexOf(23));
        numbers.print();

    }
}
