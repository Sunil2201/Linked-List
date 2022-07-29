package com.Sunil;

public class LL {

    private Node head; // Null by default

    private Node tail; // Null by default

    private int size;

    public LL() {
        this.size = 0;
    }
    public int displaySize(){
        return this.size;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        // first item being added
        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size-1){
            deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }
    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
