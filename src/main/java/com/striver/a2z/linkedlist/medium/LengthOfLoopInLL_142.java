package com.striver.a2z.linkedlist.medium;

import com.striver.a2z.common.ListNode;

public class LengthOfLoopInLL_142 {
    public ListNode detectCycle(ListNode head) {
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
}
