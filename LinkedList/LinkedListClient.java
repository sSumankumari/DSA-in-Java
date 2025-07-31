package LinkedList;

import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListClient {
    static SinglyLinkedList Head;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList n = new SinglyLinkedList(5);
        Head = n;

        int i=0;
        while (i<5){
            SinglyLinkedList nn = new SinglyLinkedList();
            nn.val = sc.nextInt();
            n.next = nn;
            n = nn;
            i++;
        }

        display(Head);
        addLast(8);
        display(Head);
        addLast(7);
        addLast(-1);
        display(Head);

        addFront(11);
        addFront(20);
        display(Head);

        addPosition(3, 30);
        addPosition(8, 50);
        display(Head);
    }
    public static void display(SinglyLinkedList Head){
        SinglyLinkedList n = Head;

        while (n!=null){
            System.out.print(n.val+"->");
            n = n.next;
        }
        System.out.println();
    }
    public static void addLast(int val){
        if (Head == null){
            SinglyLinkedList n = new SinglyLinkedList(val);
            Head = n;
            return;
        }
        SinglyLinkedList prev = null;
        SinglyLinkedList curr = Head;

        while (curr != null){
            prev = curr;
            curr = curr.next;
        }
        SinglyLinkedList n = new SinglyLinkedList(val);
        prev.next = n;
    }
    public static void addFront(int val){
        SinglyLinkedList n = new SinglyLinkedList(val);
        if(Head == null){
            Head = n;
        }
        n.next = Head;
        Head = n;
    }
    public static void addPosition(int pos, int val){
        SinglyLinkedList curr = Head;
        SinglyLinkedList prev = null;

        while (pos > 0){
            prev = curr;
            curr = curr.next;
            pos--;
        }

        SinglyLinkedList n = new SinglyLinkedList(val);
        prev.next = n;
        n.next = curr;
    }
}
