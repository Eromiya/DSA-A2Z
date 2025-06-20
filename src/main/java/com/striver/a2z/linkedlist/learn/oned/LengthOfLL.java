package com.striver.a2z.linkedlist.learn.oned;

import com.striver.a2z.common.ListNode;

public class LengthOfLL {
    public static int lengthOfLL(ListNode head){
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        listNode1.next = listNode2;
        InsertNodeInLL.head = listNode1;
        InsertNodeInLL.printLL(InsertNodeInLL.head);

        int len = lengthOfLL(InsertNodeInLL.head);

        // To check the result
        System.out.println();
        System.out.println(len);
        InsertNodeInLL.printLL(InsertNodeInLL.head);
    }
}
