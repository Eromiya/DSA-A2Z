package com.striver.a2z.linkedlist.learn.dll;

import com.striver.a2z.common.Node;

public class ReverseDLL {
    static Node head = null;

    public static Node reverseDLL(Node head){
        Node temp = head, prev = null;
        while(temp!=null){
            prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            temp = temp.prev;
        }
        head = prev.prev;
        return head;
    }
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node2.prev = node1;
        node1.next = node2;

        head = node1;
        printLL(head);

        // Insert an element at th end
        head = InsertNodeInDLL.insertAtEnd(head, 3);

        // Insert an element at th start
        head = InsertNodeInDLL.insertAtStart(head, 0);

        // List
        System.out.println();
        printLL(head);

        head = reverseDLL(head);

        // To check the result
        System.out.println();
        printLL(head);
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
