package com.striver.a2z.linkedlist.learn.oned;

import com.striver.a2z.common.ListNode;

public class DeleteANodeInLL_237 {
    static ListNode head = null;
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        listNode1.next = listNode2;
        head = listNode1;
        printLL(head);

//        // Insert an element at th end
//        head = insertAtEnd(head, 3);
//
//        // Insert an element at th start
//        head = insertAtStart(head, 0);
        deleteNode(listNode2);

        // To check the result
        System.out.println();
        printLL(head);
    }

    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

