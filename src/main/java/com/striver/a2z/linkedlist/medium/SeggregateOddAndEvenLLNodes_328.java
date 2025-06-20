package com.striver.a2z.linkedlist.medium;

import com.striver.a2z.common.ListNode;

public class SeggregateOddAndEvenLLNodes_328 {
    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode oddPtr = head, evenPtr = head.next, evenHead = evenPtr;
        while(evenPtr!=null && evenPtr.next != null){
            oddPtr.next = evenPtr.next;
            oddPtr = oddPtr.next;
            evenPtr.next = evenPtr.next.next;
            evenPtr = evenPtr.next;
        }
        oddPtr.next = evenHead;
        return head;
    }
}
