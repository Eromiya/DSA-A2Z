package com.striver.a2z.linkedlist.learn.dll;

import com.striver.a2z.common.Node;

public class InsertNodeInDLL {
    static Node head = null;
    public static Node insertAtEnd(Node head, int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            node.prev = temp;
            temp.next = node;
        }
        return head;
    }

    public static Node insertAtStart(Node head, int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        head = node1;
        printLL(head);

        // Insert an element at th end
        head = insertAtEnd(head, 3);

        // Insert an element at th start
        head = insertAtStart(head, 0);

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
