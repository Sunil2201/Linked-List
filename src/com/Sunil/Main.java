package com.Sunil;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertLast(44);
        list.insert(80, 5);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(2));
        //System.out.println(list.displaySize());
    }
}
