package com.striver.a2z.linkedlist.medium;

import com.striver.a2z.common.ListNode;

public class ReverseLL_206 {
    static ListNode head = null;
    public static ListNode insertAtEnd(ListNode head, int val){
        ListNode listNode = new ListNode(val);
        if(head == null){
            head = listNode;
        }
        else{
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = listNode;
        }
        return head;
    }

    public static ListNode insertAtStart(ListNode head, int val){
        ListNode listNode = new ListNode(val);
        if(head == null){
            head = listNode;
        }
        else{
            listNode.next = head;
            head = listNode;
        }
        return head;
    }

    public static ListNode reverseLL(ListNode head) {
        ListNode prev =null, temp = head, next = null;
        while(temp !=null){
            next= temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    public static ListNode reverseListRecursive(ListNode head) {
        /* recursive solution */
        return reverseRec(head, null);
    }

    private static ListNode reverseRec(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseRec(next, head);
    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        head = listNode1;
        printLL(head);

        // Insert an element at th end
        head = insertAtEnd(head, 3);

        // Insert an element at th start
        head = insertAtStart(head, 0);
        // Before Processing
        System.out.println();
        printLL(head);

        //Middle Element
        ListNode listNode = reverseListRecursive(head);
        // To check the result
        System.out.println();
        printLL(listNode);
    }

    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
