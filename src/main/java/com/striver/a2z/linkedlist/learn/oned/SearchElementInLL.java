package com.striver.a2z.linkedlist.learn.oned;

import com.striver.a2z.common.ListNode;

public class SearchElementInLL {
    public static boolean search(ListNode head, int val){
        ListNode temp = head;
        while(temp!=null){
            if(temp.val == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        listNode1.next = listNode2;
        InsertNodeInLL.head = listNode1;
        InsertNodeInLL.printLL(InsertNodeInLL.head);

        boolean search1 = search(InsertNodeInLL.head, 2);
        boolean search2 = search(InsertNodeInLL.head, 55);

        // To check the result
        System.out.println();
        System.out.println(search1);
        System.out.println(search2);
        InsertNodeInLL.printLL(InsertNodeInLL.head);
    }
}
