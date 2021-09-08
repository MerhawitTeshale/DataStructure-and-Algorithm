package edu.linkedlist;

import java.util.Arrays;

public class Main {
  public static void main(String [] args){
      LinkedList list=new LinkedList();
      list.addLast(10);
      list.addLast(20);
      list.addFirst(5);
      //System.out.println("the original list size is "+ list.size());
      //list.removeFirst();
     //System.out.println(list.contains(5));
     //list.removeLast();
      list.reverse();
      System.out.println("the final list size is "+ list.size());
      int [] array = list.toArray();
    System.out.println(list.getKthFromTheEnd(1));
      System.out.println(Arrays.toString(array));
  }
}
