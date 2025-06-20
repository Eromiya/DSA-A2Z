package com.striver.a2z.linkedlist.medium;

import com.striver.a2z.common.ListNode;

import java.util.Stack;

public class LLPalindrome_234 {

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

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        Stack<Integer> stack = new Stack<>();
        while(fast!=null && fast.next != null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast!=null && fast.next==null){
            slow = slow.next;
        }

        while(!stack.isEmpty()){
            if(slow==null || slow.val!=stack.pop()){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        head = listNode1;
        printLL(head);

        // Insert an element at th end
//        head = insertAtEnd(head, 2);
        head = insertAtEnd(head, 1);
        head = insertAtEnd(head, 0);

        // Insert an element at th start
        head = insertAtStart(head, 0);
        // Before Processing
        System.out.println();
        printLL(head);

        //Is Palindrome
        boolean isPalindrome = isPalindrome(head);

        // To check the result
        System.out.println();
        System.out.println(isPalindrome);
    }

    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
