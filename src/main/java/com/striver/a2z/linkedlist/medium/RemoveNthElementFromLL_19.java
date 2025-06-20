package com.striver.a2z.linkedlist.medium;

import com.striver.a2z.common.ListNode;

import java.util.Stack;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
public class RemoveNthElementFromLL_19 {
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

    /**
     * More Efficient
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for(int i=0;i<n;i++){
            fast = fast.next;

        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        int count = lengthOfLL(head);
        System.out.println("CT" + count);
        if(count<n){
            return null;
        }
        int ind = count-n;
        ListNode temp = head;
        while(ind>0){
            temp = temp.next;
            ind--;
        }
        if(temp.next!=null && temp.next.next!=null){
            temp.next = temp.next.next;
        }
        else {
            temp.next = null;
        }
        return head;
    }

    public static int lengthOfLL(ListNode head){
        ListNode fast = head, slow =head ;
        int count =0;
        while(fast!= null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            count++;
        }
        count+=count;
        if(fast!=null && fast.next==null){
            count+=1;
        }
        return count;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        head = listNode1;
        printLL(head);

        // Insert an element at th end
        head = insertAtEnd(head, 2);
        head = insertAtEnd(head, 1);
//        head = insertAtEnd(head, 0);

        // Insert an element at th start
        head = insertAtStart(head, 0);
        // Before Processing
        System.out.println();
        printLL(head);

        // Remove element
        head = removeNthFromEnd(head, 2);

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
