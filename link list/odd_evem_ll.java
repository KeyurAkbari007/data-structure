class o_e {
    Node headodd = null, headeven = null, tailodd = null, taileven = null;

    static class Node {
        int data;
        Node next;
        Node head2;

        Node(int m) {
            this.data = m;
            this.next = null;
        }
    }

    public void Insert(int m) {
        Node mNode = new Node(m);
        if (m % 2 == 0) {
            insert1(m);
        } else {

            if (headodd == null) {
                headodd = mNode;
                tailodd = mNode;
            } else {
                tailodd.next = mNode;
                tailodd = mNode;
            }
        }

    }

    public void insert1(int m) {
        Node mNode = new Node(m);
        if (headeven == null) {
            headeven = mNode;
            taileven = mNode;
        } else {
            taileven.next = mNode;
            taileven = mNode;
        }
    }

    public void dispaly() {
        Node temp1 = headodd;
        Node temp2 = headeven;
        if (temp1 == null) {
            System.out.println();
            System.out.println("------- odd linked list is empty ------");
        } else {
            while (temp1.next != null) {
                System.out.print(" " + temp1.data + "=>");
                temp1 = temp1.next;
            }
            System.out.print(" " + temp1.data);
        }
        if (temp2 == null) {
            System.out.println();
            System.out.println("------- even linked list is empty ------");
        } else {
            System.out.println();
            while (temp2.next != null) {

                System.out.print(" " + temp2.data + "=>");
                temp2 = temp2.next;
            }
            System.out.print(" " + temp2.data);
        }

    }
}

public class odd_evem_ll {
    public static void main(String[] args) {
        o_e obj = new o_e();
        obj.Insert(1);
        obj.Insert(3);
        obj.Insert(5);
        obj.Insert(7);
        obj.Insert(2);
        obj.dispaly();
    }
}
