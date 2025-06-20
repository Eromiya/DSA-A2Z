package com.striver.a2z.linkedlist.learn.dll;

import com.striver.a2z.common.Node;

public class DeleteNodeInDLL {
    static Node head = null;

    public static Node deleteDLL(Node head, int val){
        Node temp = head;
        while (temp != null){
            if(temp.data == val){
                if(temp.prev !=  null){
                    temp.prev.next = temp.next;
                }
                if(temp.next != null)
                {
                    temp.next.prev = temp.prev;
                }
            }
            temp = temp.next;
        }
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

        head = deleteDLL(head, 2);

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
