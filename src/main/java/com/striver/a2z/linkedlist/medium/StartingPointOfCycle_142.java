package com.striver.a2z.linkedlist.medium;

import com.striver.a2z.common.ListNode;

public class StartingPointOfCycle_142 {
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

    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast !=null && fast.next!=null){
            fast = fast.next.next;
            slow =  slow.next;
            if(fast == slow){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        head = listNode1;
        printLL(head);

        // Insert an element at th start
        head = insertAtStart(head, 0);

        ListNode listNode4 = new ListNode(4);
        listNode2.next = listNode4;
        listNode4.next = listNode1;


        // Before Processing
        System.out.println();

        // Cycle
        ListNode node1 = detectCycle(head);
        // To check the result
        System.out.println(node1!=null? node1.val:null);

        // Cycle
        ListNode node2 = detectCycle(MiddleOfLL_876.head);
        // To check the result
        System.out.println(node2!=null? node2.val:null);

    }
    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
