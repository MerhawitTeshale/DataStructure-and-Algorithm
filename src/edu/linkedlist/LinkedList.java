package edu.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {

    // we make this class internal because we dont want this to
    //be accessed outside of the linked list class
    private class Node {
        private int value;
        private Node next;


        //we need constructor to set the value
        //because we dont need any node with out a value
        public Node(int value) {
            this.value = value;
        }
    }

    //this are the two ref
    // head and tail
    private Node first;
    private Node last;
    private int size;
    public void addLast(int item) {
        Node node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        //we dont need to write the logic again
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        //we need to remove the link for java garbage collector to
        //remove the object
        //if LL is empty
        if (isEmpty()) throw new NoSuchElementException();

        //if our LL has one item
        if (first == last)
            first = last = null;

        else {
            Node second = first.next;
            //we remove the link
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {

        if(isEmpty()) throw new NoSuchElementException();

        if(first==last)
            first=last=null;
        else {
            Node previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == last) return current;
            current = current.next;

        }
        return null;
    }
public int size(){
        return size;
}
    private boolean isEmpty() {
        return first == null;
    }

    public int[] toArray(){
        int [] array=new int[size];
        Node current=first;
        int index=0;
        while(current!=null){
            array[index++]=current.value;
            current=current.next;
        }
        return array;
    }

    public void reverse(){

        if (isEmpty()) return;
        Node previous=first;
        Node current=first.next;

        while (current!=null){
            Node next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }

        // last node is the first and it points to null
        last=first;
        last.next=null;
        //last becomes first
        first=previous;
    }

    public int getKthFromTheEnd(int k){
        if(isEmpty()) throw new IllegalStateException();
        Node a =first;
        Node b =first;

        for (int i=0;i< k-1;i++) {
            b = b.next;
            if(b==null){
                throw new IllegalArgumentException();
            }
        }
        while (b!=last){
            a=a.next;
            b=b.next;
        }
        return a.value;
    }

}
