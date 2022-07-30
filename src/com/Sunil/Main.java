package com.Sunil;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(5);
//        list.insertFirst(9);
//        list.insertLast(44);
//        list.insert(80, 5);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(2));
        //System.out.println(list.displaySize());

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(5);
//        list.insertFirst(9);
//        list.insertLast(10);
//        list.insert(5, 13);
//        list.display();

        CLL list = new CLL();
        list.insert(3);
        list.insert(8);
        list.insert(17);
        list.insert(23);
        list.delete(17);
        list.display();
    }
}
