package com.striver.a2z.linkedlist.medium;

import com.striver.a2z.common.ListNode;

public class DeleteMiddleNodeInLL_2095 {
    /**
     * Most Efficient
     * @param head
     * @return
     */
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        return head;
    }
}
