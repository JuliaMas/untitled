package org.example.lesson4.ClassWork;

 /* Definition for singly-linked list.

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Ex01 {

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode dummy = new ListNode();
            ListNode curr = head;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = dummy.next;
                dummy.next = curr;
                curr = next;
            }
            return dummy.next;
        }
    }
}*/
