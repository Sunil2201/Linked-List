package com.Sunil;

import java.util.List;

public class CycleQuestions {
    public static void main(String[] args) {

    }
//    https://leetcode.com/problems/linked-list-cycle/
//    Amazon and microsoft
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

//  Length of cycle
    public int lengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
//              Calculate the length
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthOfCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        // Find the start node
        ListNode f = head;
        ListNode s = head;

        while(length > 0){
            s=s.next;
            length--;
        }

        // Keep moving both forward and they will meet at cycle start
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
