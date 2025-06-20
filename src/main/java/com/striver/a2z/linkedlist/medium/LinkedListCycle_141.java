package com.striver.a2z.linkedlist.medium;

import com.striver.a2z.common.ListNode;

// Two pointer
public class LinkedListCycle_141 {
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

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast !=null && fast.next!=null){
            fast = fast.next.next;
            slow =  slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;

    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        head = listNode1;
        printLL(head);

        // Insert an element at th end
//        head = insertAtEnd(head, 3);

        // Insert an element at th start
        head = insertAtStart(head, 0);

        ListNode listNode4 = new ListNode(4);
        listNode2.next = listNode4;
        listNode4.next = head;


        // Before Processing
        System.out.println();

//        printLL(head);

        // Cycle
        boolean cycleFound = hasCycle(head);
        // To check the result
        System.out.println(cycleFound);

        // Cycle
        boolean cycleFound1 = hasCycle(MiddleOfLL_876.head);
        // To check the result
        System.out.println(cycleFound1);
    }

    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
