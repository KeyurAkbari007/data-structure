// import List.Node;
class idoubly {
    Node head = null, tail = null;
    static class Node{
        int data;
        Node next;
        Node prev;

    Node(int m){
            this.data=m;
            this.next=null;
            this.prev=null;
        }

    }

    public void insertFirst(int m) {
        Node mNode = new Node(m);
        if (head == null) {
            head = mNode;
            tail = mNode;
        } else {
            head.prev = mNode;
            mNode.next = head;
            head = mNode;

        }
    }

    public void insertLast(int m) {
        Node mNode = new Node(m);
        if (head == null) {
            head = mNode;
            tail = mNode;
        } else {
            mNode.prev = tail;
            tail.next = mNode;
            tail = mNode;
        }
    }

    public void insertMiddle(int m, int n) {
        Node mNode = new Node(m);
        if (head == null) {
            head = mNode;
            tail = mNode;
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == n) {
                    mNode.prev = temp.prev;
                    mNode.next = temp;
                    temp.prev = mNode;
                    mNode.prev.next = mNode;
                    break;

                }
                temp = temp.next;
            }
            if (temp == null) {
                insertLast(m);
            }

        }

    }

    public void display() {
        Node temp1 = head;
        while (temp1.next != null) {
            System.out.print(" " + temp1.data + " <=>");
            temp1 = temp1.next;
        }
        System.out.print(" " + temp1.data);
    }

}

public class doubly_ll {
    public static void main(String[] args) {
        idoubly obj = new idoubly();
        obj.insertFirst(1);
        obj.insertLast(2);
        obj.insertLast(3);
        obj.insertLast(4);
        obj.insertLast(6);
        obj.insertMiddle(5, 6);
        obj.display();
    }

}
